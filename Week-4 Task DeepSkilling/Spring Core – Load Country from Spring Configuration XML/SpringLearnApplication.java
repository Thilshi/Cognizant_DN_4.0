import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SpringLearnApplication {

    public static void main(String[] args) throws ParseException {
        SpringApplication.run(SpringLearnApplication.class, args);
        System.out.println("Hello from spring boot");
        displayDate();
    }

    public static void displayDate() throws ParseException {
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
        Date date = format.parse("31/12/2018");
        System.out.println("📅 Parsed Date: " + date);
    }
}

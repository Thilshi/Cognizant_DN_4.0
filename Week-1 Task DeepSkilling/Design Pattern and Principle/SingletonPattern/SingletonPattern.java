class Logger
{
      
	private static Logger instance;
        //constructor
	 private Logger()
	 {
		System.out.println("Log is created");
	 }
	 public static Logger getInstance(){
		
		 if(instance==null)
		 {
			 instance=new Logger();
		 }
		 return instance;
	 }
	 public static void log(String message)
	 {
		 System.out.println("Log :"+message);
	 }
}
public class Exercise1 
{
 public static void main(String[] args) 
 {
	Logger l1=Logger.getInstance();
	Logger l2=Logger.getInstance();
	
	Logger.log("First Message");
	Logger.log("Second message");
	
	if(l1==l2)
	{
		System.out.println("Only once the logger is created");
	}
	else
	{
		System.out.println("Logger created many times");
	}
	
}
}

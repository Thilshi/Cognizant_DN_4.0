interface Notifier {
 void send(String message);
}

class EmailNotifier implements Notifier {
 @Override
 public void send(String message) {
     System.out.println("Sending Email: " + message);
 }
}

abstract class NotifierDecorator implements Notifier {
 protected Notifier wrappedNotifier;

 public NotifierDecorator(Notifier notifier) {
     this.wrappedNotifier = notifier;
 }

 @Override
 public void send(String message) {
     wrappedNotifier.send(message);
 }
}


class SMSNotifierDecorator extends NotifierDecorator {
 public SMSNotifierDecorator(Notifier notifier) {
     super(notifier);
 }

 @Override
 public void send(String message) {
     super.send(message);
     System.out.println("Sending SMS: " + message);
 }
}


class SlackNotifierDecorator extends NotifierDecorator {
 public SlackNotifierDecorator(Notifier notifier) {
     super(notifier);
 }

 @Override
 public void send(String message) {
     super.send(message);
     System.out.println("Sending Slack Message: " + message);
 }
}


public class DecoratorPattern {
 public static void main(String[] args) {
     // Base notifier (Email only)
     Notifier emailNotifier = new EmailNotifier();

     // Add SMS feature
     Notifier smsAndEmail = new SMSNotifierDecorator(emailNotifier);

     // Add Slack on top of Email and SMS
     Notifier fullNotifier = new SlackNotifierDecorator(smsAndEmail);

     // Send message via all channels
     fullNotifier.send("Hello Thilshi! This is your system alert 🚨");
 }
}


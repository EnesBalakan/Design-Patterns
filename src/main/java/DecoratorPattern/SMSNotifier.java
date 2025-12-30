package DecoratorPattern;

public class SMSNotifier extends NotifierDecorator{
    public SMSNotifier(Notifier wrappee) {
        super(wrappee);
    }

    public void send(String message) {
        super.send(message);
        System.out.println("SMS: " + message);
    }
}

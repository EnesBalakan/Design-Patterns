package DecoratorPattern;

public class SlackNotifier extends NotifierDecorator{
    public SlackNotifier(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Slack" + message);
    }
}

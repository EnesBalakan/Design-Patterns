package ObserverPattern;

public class WebClient implements Observer {
    private final String username;


    public WebClient(String username) {
        this.username = username;
    }

    @Override
    public void update(double newPrice) {
        System.out.println(" [WEB - " + username + " ] " + "Yeni Fiyat: " + newPrice);
    }
}

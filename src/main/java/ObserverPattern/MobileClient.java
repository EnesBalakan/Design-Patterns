package ObserverPattern;

public class MobileClient implements Observer{
    private final String username;

    public MobileClient(String username) {
        this.username = username;
    }

    @Override
    public void update(double newPrice) {
        System.out.println("[MOBILE - " + username + "]" + " Yeni fiyat: " + newPrice);
    }
}

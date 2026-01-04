package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        Stock Şölen = new Stock("ŞÖLEN", 100);

        Observer mobile = new MobileClient("Mustafa");
        Observer web = new WebClient("Enes");

        Şölen.registerObserver(mobile);
        Şölen.registerObserver(web);

        Şölen.setPrice(150);
        Şölen.setPrice(180);
    }
}

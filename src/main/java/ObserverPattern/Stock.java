package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Stock  implements Subject{
    private final List<Observer> observers = new ArrayList<>();
    private final String symbol;
    private double price;


    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers ){
            o.update(price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObserver();
    }
}

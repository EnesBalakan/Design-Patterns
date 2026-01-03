package StrategyPattern;

public class PaypalStratejisi implements OdemeStratejisi{

    private String isim, hesapNo;

    public PaypalStratejisi(String hesapNo, String isim) {
        this.hesapNo = hesapNo;
        this.isim = isim;
    }

    @Override
    public void ode(int tutar) {
        System.out.println(tutar + " TL, " + hesapNo + " hesabı ile ödendi.");
    }
}

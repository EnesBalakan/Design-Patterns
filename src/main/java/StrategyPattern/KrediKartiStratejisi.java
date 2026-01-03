package StrategyPattern;

public class KrediKartiStratejisi implements OdemeStratejisi{

    private String isim, kartNo;

    public KrediKartiStratejisi(String isim, String kartNo) {
        this.isim = isim;
        this.kartNo = kartNo;
    }

    @Override
    public void ode(int tutar) {
        System.out.println(tutar + " TL, " + kartNo + " nolu kredi kartı ile ödendi");
    }
}

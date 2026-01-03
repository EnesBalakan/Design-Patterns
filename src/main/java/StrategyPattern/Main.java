package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Sepet sepetim = new Sepet();
        sepetim.urunEkle(500);
        sepetim.urunEkle(350);
        sepetim.urunEkle(1200);

        // Senaryo 1, kerdi kartı
        System.out.println(" --- KREDİ KARTI SENARYOSU --- ");
        sepetim.setOdemeYontemi(new KrediKartiStratejisi("Enes Balakan", "48246502"));
        sepetim.odemeYap();

        // Senaryo 2, Paypall
        System.out.println(" --- PAYPALL SENARYOSU --- ");
        sepetim.setOdemeYontemi(new PaypalStratejisi("18954852", "Rahmi Erten"));
        sepetim.odemeYap();

    }
}

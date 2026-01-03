package StrategyPattern;

public class Sepet {
    // Sepet, spesifik bir sınıfı (KrediKarti) değil, arayüzü tutar!
    // Bu sayede her türlü ödeme yöntemini kabul edebilir.
    private OdemeStratejisi odemeYontemi;
    private int toplamTutar;

    public Sepet(){
        this.toplamTutar = 0;
    }

    public void urunEkle(int fiyat){
        this.toplamTutar += fiyat;
    }

    public void urunCikar(int fiyat){
        this.toplamTutar -= fiyat;
    }

    // Stratejiyi (Kaseti) çalışma anında değiştirme metodu
    public void setOdemeYontemi(OdemeStratejisi odemeYontemi){
        this.odemeYontemi = odemeYontemi;
    }

    public void odemeYap(){
        if (odemeYontemi == null){
            System.out.println("Lütfen bir ödeme yöntemi seçiniz!");
        }
        else{
            // Sepet burada "Nasıl?" sorusuyla ilgilenmez.
            // Sadece "Öde" der. İşin nasıl yapılacağını Strateji sınıfı bilir.
            odemeYontemi.ode(toplamTutar);
        }
    }
}

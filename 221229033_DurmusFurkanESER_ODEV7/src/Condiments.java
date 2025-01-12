
public class Condiments extends Urun {
	public Condiments(String ad, int kategoriIndex, double birimAgirlik, double birimFiyat, int stokMiktari) {
        super(ad, kategoriIndex, birimAgirlik, birimFiyat, stokMiktari);
    }

    @Override
    public void stokAzalt(int miktar) {
    	System.out.println("stokazalt");
        super.stokAzalt(miktar);
        System.out.println("Condiments kategorisi için stok azaltıldı.");
    }
    
    @Override
    public void urunDetaylari() {
    	System.out.println("urunDetaylari");
    	System.out.println("Çeşniler için detaylar");
        super.urunDetaylari();
    }
    
    @Override
    public void birimAgirlikEkle(int miktar) {
    	System.out.println("birimAgirlikEkle:");
    	 birimAgirlik += miktar;
    	 System.out.println(ad +  "çeşniler için  Birim ağırlık güncellendi: " + birimAgirlik);
    }
    @Override
    public void fiyatGuncelle(double yeniFiyat) {
    	System.out.println("fiyatGuncelle:");
    	birimFiyat += yeniFiyat;
        System.out.println("Condiments kategorisi için fiyat güncellendi:" + yeniFiyat);
    }
    
    
    public void indirimUygula(double oran) {
    	System.out.println("indirimUygula:");
        birimFiyat *= (100 - oran);
        System.out.println(ad + " için indirim uygulandı. Yeni fiyat: " + birimFiyat);
    }
}

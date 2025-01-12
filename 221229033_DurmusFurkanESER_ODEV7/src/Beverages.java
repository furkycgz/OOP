
public class Beverages extends Urun {
	
	  public Beverages(String ad, int kategoriIndex, double birimAgirlik, double birimFiyat, int stokMiktari) {
	        super(ad, kategoriIndex, birimAgirlik, birimFiyat, stokMiktari);
	    }

	    @Override
	    public void fiyatGuncelle(double yeniFiyat) {
	    	System.out.println("fiyatGuncelle:");
	    	birimFiyat += yeniFiyat;
	        System.out.println("Beverages kategorisi için fiyat güncellendi:" + yeniFiyat);
	    }
	    @Override
	    public void birimAgirlikEkle(int miktar) {
	    	System.out.println("birimAgirlikEkle:");
	    	 birimAgirlik += miktar;
	    	 System.out.println(ad +  "İçecekler için  Birim ağırlık güncellendi: " + birimAgirlik);
	    }

	    public void ozellikEkle(String ozellik) {
	    	System.out.println("ozellikEkle:");
	        System.out.println(ad + " için özellik eklendi: " + ozellik);
	    }
}


public class DairyProducts extends Urun{
	
	    public DairyProducts(String ad, int kategoriIndex, double birimAgirlik, double birimFiyat, int stokMiktari) {
	        super(ad, kategoriIndex, birimAgirlik, birimFiyat, stokMiktari);
	    }

	    @Override
	    public void birimAgirlikEkle(int miktar) {
	    	System.out.println("birimAgirlikEkle:");
	    	 birimAgirlik += miktar;
	    	 System.out.println(ad +  "Süt Ürünleri için  Birim ağırlık güncellendi: " + birimAgirlik);
	    }
	    @Override
	    public void fiyatGuncelle(double yeniFiyat) {
	    	System.out.println("fiyatGuncelle:");
	    	birimFiyat += yeniFiyat;
	        System.out.println("DairyProducts kategorisi için fiyat güncellendi:" + yeniFiyat);
	    }

	    public void kapasiteHesapla(double kapasite) {
	    	System.out.println("kapasiteHesapla:");
	        int toplamKapasite = (int) Math.ceil((stokMiktari * birimAgirlik) / kapasite);
	        System.out.println(ad + " için gerekli toplam kapasite: " + toplamKapasite);
	    }
	}

	



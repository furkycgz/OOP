
public class Cereals extends Urun {
	    public Cereals(String ad, int kategoriIndex, double birimAgirlik, double birimFiyat, int stokMiktari) {
	        super(ad, kategoriIndex, birimAgirlik, birimFiyat, stokMiktari);
	    }

	    @Override
	    public void fiyatGuncelle(double yeniFiyat) {
	    	System.out.println("fiyatGuncelle:");
	    	    birimFiyat += yeniFiyat;
	        System.out.println("Cereals kategorisi için fiyat güncellendi:" + yeniFiyat);
	    }
	    @Override
	    public void birimAgirlikEkle(int miktar) {
	    	System.out.println("birimAgirlikEkle:");
	    	 birimAgirlik += miktar;
	    	 System.out.println(ad +  "Tahıllar için  Birim ağırlık güncellendi: " + birimAgirlik);
	    }


	    public void stokSil() {
	    	System.out.println("stokSil:");
	        System.out.println(ad + " ürünü stoktan silindi.");
	        stokMiktari = 0;
	    }
	}

	
	


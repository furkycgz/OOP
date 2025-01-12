
public class Confections extends Urun {
	
	
	    public Confections(String ad, int kategoriIndex, double birimAgirlik, double birimFiyat, int stokMiktari) {
	        super(ad, kategoriIndex, birimAgirlik, birimFiyat, stokMiktari);
	    }

	    @Override
	    public void stokAzalt(int miktar) {
	    	System.out.println("stokazalt");
	        super.stokAzalt(miktar);
	        System.out.println("Confections kategorisi için stok azaltıldı.");
	    }
	    @Override
	    public void urunDetaylari() {
	    	System.out.println("urunDetaylari");
	    	System.out.println("şekerleme için detaylar:");
	        super.urunDetaylari();
	    }
	    @Override
	    public void birimAgirlikEkle(int miktar) {
	    	System.out.println("birimAgirlikEkle:");
	    	 birimAgirlik += miktar;
	    	 System.out.println(ad +  "Şekerlemeler için  Birim ağırlık güncellendi: " + birimAgirlik);
	    }
	    @Override
	    public void fiyatGuncelle(double yeniFiyat) {
	    	System.out.println("fiyatGuncelle:");
	    	birimFiyat += yeniFiyat;
	        System.out.println("Confections kategorisi için fiyat güncellendi:" + yeniFiyat);
	    }


	    public void zamYap(double miktar) {
	    	System.out.println("zamYap");
	        birimFiyat += miktar;
	        System.out.println(ad + " için zam yapıldı. Yeni fiyat: " + birimFiyat);
	    }
	}


/*
public interface IUrun {
	 public void birimAgirlikEkle(int miktar);//2
	 public void stokAzalt(int miktar);//2
	 public void fiyatGuncelle(double yeniFiyat);//2
	 public void urunDetaylari();//2
	
	
}

public abstract class  Urun implements IUrun  {
 
	    protected String ad;
	    protected int kategoriIndex;
	    protected double birimAgirlik;
	    protected double birimFiyat;
	    protected int stokMiktari;

	    public Urun(String ad, int kategoriIndex, double birimAgirlik, double birimFiyat, int stokMiktari) {
	        this.ad = ad;
	        this.kategoriIndex = kategoriIndex;
	        this.birimAgirlik = birimAgirlik;
	        this.birimFiyat = birimFiyat;
	        this.stokMiktari = stokMiktari;
	    }
	   
	   
	    public abstract void birimAgirlikEkle(int miktar);

	    @Override
	    public void stokAzalt(int miktar) {
	        if (miktar > stokMiktari) {
	            System.out.println("Stok yetersiz! Mevcut stok: " + stokMiktari);
	        } else {
	            stokMiktari -= miktar;
	            System.out.println(ad + " stok miktarı güncellendi: " + stokMiktari);
	        }
	    }  
	    public abstract void fiyatGuncelle(double yeniFiyat);

	    @Override
	    public void urunDetaylari() {
	        System.out.println("Ürün: " + ad);
	        System.out.println("Kategori Index: " + kategoriIndex);
	        System.out.println("Birim Ağırlık: " + birimAgirlik);
	        System.out.println("Birim Fiyat: " + birimFiyat);
	        System.out.println("Stok Miktarı: " + stokMiktari);
	    }
	
	
}

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

	
*/


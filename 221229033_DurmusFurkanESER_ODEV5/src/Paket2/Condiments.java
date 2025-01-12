package Paket2;

import java.util.List;

public class Condiments extends urun {
	 private String kategoriAdi = "Condiments";
	    private String detay;

	    public Condiments(String ad, int KategoriIndex, double BirimAgirligi, double BirimFiyat, int StokMiktari ) {
	        super(ad,KategoriIndex, BirimAgirligi, BirimFiyat, StokMiktari );
	       
	    }
	    public void detayYazdir() {
	        System.out.println("Çeşniler: " + getAd() + ", Detay: " + detay);
	    }
	    
	    
	    private static void ençokaindirim(List<Condiments> cesniler) {
	    	  double maxdeger = 0;
	    	  Condiments maxCesni = null;

	    
	    	    for (Condiments cdt : cesniler) {
	    	        if (cdt.getStokMiktari() > maxdeger) {
	    	            maxdeger = cdt.getStokMiktari();
	    	            maxCesni = cdt;
	    	        }
	    	    }

	    	    if (maxCesni != null) {
	    	
	    	       
	    	        double yeniFiyat = maxCesni.getBirimFiyati() * 0.9;

	    	       

	    	   
	    	        System.out.println("Yüzde 10 indirim yapılan ürün: " + maxCesni.getAd());
	    	        System.out.println(" Yeni Fiyat: " + yeniFiyat);
	    	    }
	    	}
	    public static void getençokaindirim(List<Condiments> cesniler) {
	    	
	    	ençokaindirim(cesniler);
	    	
	    }
	    protected String getKategoriAdi() {
	        return kategoriAdi;
	    }

	    protected String getDetay() {
	        return detay;
	    }
	    
	    
	    
}

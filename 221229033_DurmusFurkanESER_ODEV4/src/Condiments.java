import java.util.List;

public class Condiments extends urun {
	 private String kategoriAdi = "Condiments";
	    private String detay;

	    public Condiments(String ad, int KategoriIndex, double BirimAğirliki, double BirimFiyati, int StokMiktari ) {
	        super(ad,2, BirimAğirliki, BirimFiyati, StokMiktari );
	        this.detay = "Mümekkemmel çeşni...";
	    }
	    public void detayYazdir() {
	        System.out.println("Çeşniler: " + ad + ", Detay: " + detay);
	    }
	    
	    public static void ençokaindirim(List<Condiments> cesniler) {
	    	  double maxdeger = 0;
	    	  Condiments maxCesni = null;

	    
	    	    for (Condiments cdt : cesniler) {
	    	        if (cdt.StokMiktari > maxdeger) {
	    	            maxdeger = cdt.StokMiktari;
	    	            maxCesni = cdt;
	    	        }
	    	    }

	    	    if (maxCesni != null) {
	    	
	    	       
	    	        double yeniFiyat = maxCesni.BirimFiyati * 0.9;

	    	       

	    	   
	    	        System.out.println("Yüzde 10 indirim yapılan ürün: " + maxCesni.ad);
	    	        System.out.println(" Yeni Fiyat: " + yeniFiyat);
	    	    }
	    	}
}
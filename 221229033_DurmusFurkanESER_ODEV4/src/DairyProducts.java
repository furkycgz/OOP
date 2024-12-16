import java.util.List;

public class DairyProducts extends urun {
	 private String kategoriAdi = "DairyProducts";
	    private String detay;
 
	    public  DairyProducts(String ad, int KategoriIndex, double BirimAğirliki, double BirimFiyati, int StokMiktari) {
	        super(ad, 4, BirimAğirliki, BirimFiyati, StokMiktari );
	        this.detay = "Dünyanın en güzel sütü .";
	    }
	    public void detayYazdir() {
	        System.out.println("Süt ürünü: " + ad + ", Detay: " + detay);
	    }
	    
	    public static void kacşişeedeceğinibul(List<DairyProducts> sutUrunleri) {
	    	// yoğunluk 1 aldım 
	    	double şişelt = 2.0 ;
	    	double lttop = 0 ;
	    	for (DairyProducts dpc : sutUrunleri) {
				lttop += dpc.BirimAğirliki;
	    		
	       }
	    	 
	      double şişeSayisi = lttop / şişelt ; 	    	
	   
	      System.out.println("Gerekli şişe sayısı : " +Math.ceil(şişeSayisi) );
	      
	    } 
	    
}

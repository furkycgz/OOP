import java.util.List;

public class DairyProducts extends urun {
   
	 private String kategoriAdi = "DairyProducts";
	   

	    public  DairyProducts(String ad, int KategoriIndex, double BirimAğirliki, double BirimFiyati, int StokMiktari) {
	        super(ad, 4, BirimAğirliki, BirimFiyati, StokMiktari );
	       
	    }
	    @Override
		 public double stokOrtalamasi(List<urun> urunler) {
		     double toplam = 0;
		     int sayac = 0;

		     for (urun urn : urunler) {
		    	  if (urn.KategoriIndex == 4) { 
		             toplam += urn.StokMiktari;
		             sayac++;
		         }
		     }

		  
		     return toplam / sayac;
		 }
	    @Override
	    public void birimAğirlikimax(List<urun> urunler) {
	        double maxdeger = 0;
	        for (urun urn : urunler) {
	            if (urn.KategoriIndex == 4 && urn.BirimAğirliki > maxdeger) {
	                maxdeger = urn.BirimAğirliki;
	            }
	        }
	        System.out.println("Süt ürünleri  Birim Ağırlığı Max: " + maxdeger);
	    }
	    public static void kacşişeedeceğinibul(List<DairyProducts> sutUrunleri) {
	 
	    	double şişelt = 2.0 ;
	    	double lttop = 0 ;
	    	for (DairyProducts dpc : sutUrunleri) {
				lttop += dpc.BirimAğirliki;
	    		
	       }
	    	 
	      double şişeSayisi = lttop / şişelt ; 	    	
	   
	      System.out.println("Gerekli şişe sayısı : " +Math.ceil(şişeSayisi) );
	      
	    } 
	    // Overload
	    public static void kacşişeedeceğinibul(List<DairyProducts> sutUrunleri, int yogunluk) {
	 
	    	double şişelt = 2.0 ;
	    	double agırlık = 0 ;
	    	for (DairyProducts dpc : sutUrunleri) {
				agırlık += dpc.BirimAğirliki;
	    		
	       }
	    	double yeniAgırlık = agırlık * yogunluk ; 
	    	 
	      double şişeSayisi = yeniAgırlık / şişelt ; 	    	
	   
	      System.out.println("Girilen yogunluğa göre yeni şişe  sayısı : " +Math.ceil(şişeSayisi) );
	      
	    } 
	    

		   

}

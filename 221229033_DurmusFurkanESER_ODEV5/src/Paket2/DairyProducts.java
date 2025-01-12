package Paket2;

import java.util.List;

public class DairyProducts extends urun {
	 private String kategoriAdi = "DairyProducts";
	    private String detay;
	    
		public DairyProducts(String ad, int KategoriIndex, double BirimAgirligi, double BirimFiyat, int StokMiktari) {
			super(ad, KategoriIndex, BirimAgirligi, BirimFiyat, StokMiktari);
			
		}
       
		  public void detayYazdir() {
		        System.out.println("Süt ürünü: " + getAd() + ", Detay: " + detay);
		    }
	
		  private static void kacşişeedeceğinibul(List<DairyProducts> sutUrunleri) {
		    	// yoğunluk 1 aldım 
		    	double şişelt = 2.0 ;
		    	double lttop = 0 ;
		    	for (DairyProducts dpc : sutUrunleri) {
					lttop += dpc.getBirimAgirligi();
		    		
		       }
		    	 
		      double şişeSayisi = lttop / şişelt ; 	    	
		   
		      System.out.println("Gerekli şişe sayısı : " +Math.ceil(şişeSayisi) );
		      
		    } 
		  public static void getkacşişeedeceğinibul( List<DairyProducts> sutUrunleri  ) {
			  kacşişeedeceğinibul(sutUrunleri);
			  
		  }

		  protected String getKategoriAdi() {
		        return kategoriAdi;
		    }

		    protected String getDetay() {
		        return detay;
		    }	  
		  
		  
		  
}

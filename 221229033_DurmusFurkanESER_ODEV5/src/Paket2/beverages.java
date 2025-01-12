package Paket2;

import java.util.List;

public class beverages extends urun {
	
	  private String kategoriAdi = "Beverages";
	    private String detay = "Dünyanın en güzel içeceği";

	    public beverages(String ad, int KategoriIndex, double BirimAgirligi, double BirimFiyat, int StokMiktari) {
	        super( ad, KategoriIndex, BirimAgirligi, BirimFiyat,  StokMiktari);
	    }

	    private static void fiyatFarkı( List<beverages> icecekler) {
	    	double maxdeger = 0 ; 
			for (beverages ick : icecekler ) {
				if( ick.getBirimFiyati() > maxdeger  ) {
					maxdeger = ick.getBirimFiyati();
				}
			}	
	    	double mindeger = maxdeger ; 
	    	for (beverages ick1 : icecekler ) {
				if( ick1.getBirimFiyati() < mindeger  ) {
					mindeger = ick1.getBirimFiyati();
				}
	       }
	    	double fark = maxdeger - mindeger ; 
	    	System.out.println("fark = "+ fark );
	    }
	     
    
	    public static void getfiyatFarkı(List<beverages> icecekler) {
	    	fiyatFarkı(icecekler);
	    }
	    
	    
	    protected String getKategoriAdi() {
	        return kategoriAdi;
	    }

	    protected String getDetay() {
	        return detay;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
}	    

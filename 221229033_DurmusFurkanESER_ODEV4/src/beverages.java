import java.util.List;

public class beverages extends urun {
	 private String kategoriAdi = "beverages";
	    private String detay;
     
    public beverages(String ad, int KategoriIndex, double BirimAğirliki, double BirimFiyati, int StokMiktari ) {
        super(ad,1, BirimAğirliki, BirimFiyati, StokMiktari );
        this.detay = "Dünyanın en güzel içeceği";
       
     }
    public void detayYazdir() {
        System.out.println("içecekler: " + ad + ", Detay: " + detay);
    }
    public static void fiyatFarkı( List<beverages> icecekler) {
    	double maxdeger = 0 ; 
		for (beverages ick : icecekler ) {
			if( ick.BirimFiyati > maxdeger  ) {
				maxdeger = ick.BirimFiyati;
			}
		}	
    	double mindeger = maxdeger ; 
    	for (beverages ick1 : icecekler ) {
			if( ick1.BirimFiyati < mindeger  ) {
				mindeger = ick1.BirimFiyati;
			}
       }
    	double fark = maxdeger - mindeger ; 
    	System.out.println("fark = "+ fark );
    }
     
 }

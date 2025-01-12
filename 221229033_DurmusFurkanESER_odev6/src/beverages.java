import java.util.List;

public class beverages extends urun {
	 private String kategoriAdi = "beverages";
	 
  
 public beverages(String ad, int KategoriIndex, double BirimAğirliki, double BirimFiyati, int StokMiktari ) {
     super(ad,1, BirimAğirliki, BirimFiyati, StokMiktari );
    
    
  }
 @Override
 public double stokOrtalamasi(List<urun> urunler) {
     double toplam = 0;
     int sayac = 0;

     for (urun urn : urunler) {
    	  if (urn.KategoriIndex == 1) { 
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
         if (urn.KategoriIndex == 1 && urn.BirimAğirliki > maxdeger) {
             maxdeger = urn.BirimAğirliki;
         }
     }
     System.out.println("Beverages Birim Ağırlığı Max: " + maxdeger);
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
 // Overload
 public static void fiyatFarkı(List<beverages> icecekler,List<urun> urunler) {
	    double maxdeger = 0;
	    for (urun urn : urunler) {
	        if (urn.BirimFiyati > maxdeger) {
	            maxdeger = urn.BirimFiyati;
	        }
	    }
	    double mindeger = maxdeger;
	    for (urun urn1 : urunler) {
	        if (urn1.BirimFiyati < mindeger) {
	            mindeger = urn1.BirimFiyati;
	        }
	    }
	    double fark = maxdeger - mindeger;
	    System.out.println("Genel ürünler için fiyat farkı = " + fark);
	}

 
 
 
 
 
}
	


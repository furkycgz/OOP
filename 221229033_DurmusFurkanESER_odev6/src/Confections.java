import java.util.List;

public class Confections extends urun {
	private String kategoriAdi = " Confections";
  

    public Confections(String ad, int KategoriIndex, double BirimAğirliki,  double BirimFiyati, int StokMiktari) {
        super(ad,3, BirimAğirliki, BirimFiyati, StokMiktari );
       
    }
    @Override
	 public double stokOrtalamasi(List<urun> urunler) {
	     double toplam = 0;
	     int sayac = 0;

	     for (urun urn : urunler) {
	    	  if (urn.KategoriIndex == 3) { 
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
            if (urn.KategoriIndex == 3 && urn.BirimAğirliki > maxdeger) {
                maxdeger = urn.BirimAğirliki;
            }
        }
        System.out.println("şekerleme Birim Ağırlığı Max: " + maxdeger);
    }
    public static void şekereikitlzam( List<Confections> sekerlemeler )  {
		   for (Confections cft : sekerlemeler) {
		        cft.BirimFiyati += 2; 
		    }
		   
		   
		    System.out.println("Güncellenmiş şekerleme fiyatları : ");
		    for (Confections cft : sekerlemeler) {
		        System.out.println("Ad: " + cft.ad + ", Yeni Fiyat: " + cft.BirimFiyati);
		    }
	   }
    //Overload
    public static void şekereikitlzam(List<Confections> sekerlemeler, int minStok) {
        for (Confections cft : sekerlemeler) {
            if (cft.StokMiktari < minStok) {
            System.out.println("Stok miktarı Min stok miktarından az olan şekerlemeler 10 tl zam olursa güncellenmiş fiyatları : ");
            cft.BirimFiyati += 10;  
            System.out.println("Ad: " + cft.ad + ", Yeni Fiyat: " + cft.BirimFiyati);
            }
               
            
        }

       
    }


	   

}

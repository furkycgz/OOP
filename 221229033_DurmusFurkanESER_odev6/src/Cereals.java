import java.util.List;

public class Cereals extends urun {
	 private String kategoriAdi = "Cereals";
	  

	    public Cereals(String ad, int KategoriIndex, double BirimAğirliki, double BirimFiyati, int StokMiktari) {
	        super(ad , 5, BirimAğirliki, BirimFiyati, StokMiktari);
	      
	    }
	    @Override
		 public double stokOrtalamasi(List<urun> urunler) {
		     double toplam = 0;
		     int sayac = 0;

		     for (urun urn : urunler) {
		    	  if (urn.KategoriIndex == 5) { 
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
	            if (urn.KategoriIndex == 5 && urn.BirimAğirliki > maxdeger) {
	                maxdeger = urn.BirimAğirliki;
	            }
	        }
	        System.out.println("Tahılların Birim Ağırlığı Max: " + maxdeger);
	    }
	    public static void enazStokolanısil(List<Cereals> tahillar) {
	    	int enAz = 100;
	    	Cereals silinecek = null;
	        for (Cereals thl : tahillar) {
	            if (thl.StokMiktari < enAz ) {
	                enAz = thl.StokMiktari;
	                silinecek = thl;
	            }
	        }
	       
	        
	        tahillar.remove(silinecek);
	        System.out.println("Enaz stok miktarına sahip ürün siliniyor :   " + silinecek.ad);
	        
	        
	    	
	    }
	    //Overload
	    public static void enazStokolanısil(List<Cereals> tahillar, int minStok) {
	        Cereals silinecek = null;
	        for (Cereals thl : tahillar) {
	            if (thl.StokMiktari < minStok) {
	                silinecek = thl;
	                break; // İlk bulduğumuz ürünü siliyoruz
	            }
	        }

	        if (silinecek != null) {
	            tahillar.remove(silinecek);
	            System.out.println("Stok miktarı " + minStok + "'un altındaki listeye göre ilk ürün  siliniyor: " + silinecek.ad);
	        } else {
	            System.out.println("Belirtilen stok limitinin altındaki listeye göre  ürün bulunamadı.");
	        }
	    }


}

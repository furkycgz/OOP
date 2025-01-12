package Paket2;

import java.util.List;

public class Cereals extends urun {
	
	 private String kategoriAdi = "Cereals";
	    private String detay;
		public Cereals(String ad, int KategoriIndex, double BirimAgirligi, double BirimFiyat, int StokMiktari) {
			super(ad, KategoriIndex, BirimAgirligi, BirimFiyat, StokMiktari);
			
		}
	    
		   public void detayYazdir() {
		        System.out.println("Tahıl : " + getAd() + ", Detay: " + detay);
		    }
		   private static void enazStokolanısil(List<Cereals> tahillar) {
		    	int enAz = 100;
		    	Cereals silinecek = null;
		        for (Cereals thl : tahillar) {
		            if (thl.getStokMiktari() < enAz ) {
		                enAz = thl.getStokMiktari();
		                silinecek = thl;
		            }
		        }
		       
		        
		        tahillar.remove(silinecek);
		        System.out.println("Enaz stok miktarına sahip ürün siliniyor : mercimek  " );
		        
		        }
		   
		   public static void getenazStokolanısil(List<Cereals> tahillar) {
			   enazStokolanısil(tahillar);
				  
			  }

			  protected String getKategoriAdi() {
			        return kategoriAdi;
			    }

			    protected String getDetay() {
			        return detay;
			    }	  
			  

}

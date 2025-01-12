package Paket2;

import java.util.List;

public class Confections extends urun {
	 private String kategoriAdi = " Confections";
	    private String detay;

	    
	    public Confections(String ad, int KategoriIndex, double BirimAgirligi, double BirimFiyat, int StokMiktari) {
			super(ad, KategoriIndex, BirimAgirligi, BirimFiyat, StokMiktari);
			
		}


		public void detayYazdir() {
	        System.out.println("Şekerleme: " + getAd() + ", Detay: " + detay);
	    }
		private static void şekereikitlzam( List<Confections> sekerlemeler )  {
			   for (Confections cft : sekerlemeler) {
			        double yeniFiyat = cft.getBirimFiyati() + 2; // Eski fiyatın üstüne 2 ekle
			        cft.setBirimFiyati(yeniFiyat); // Yeni fiyatı ayarla
			    }
			   
			    System.out.println("Güncellenmiş şekerleme fiyatları : ");
			    for (Confections cft : sekerlemeler) {
			        System.out.println("Ad: " + cft.getAd() + ", Yeni Fiyat: " + cft.getBirimFiyati());
			    }
		   }
		  public static void getşekereikitlzam( List<Confections> sekerlemeler  ) {
			  
			  şekereikitlzam(sekerlemeler);
			  
		  }
		  protected String getKategoriAdi() {
		        return kategoriAdi;
		    }

		    protected String getDetay() {
		        return detay;
		    }
	
}

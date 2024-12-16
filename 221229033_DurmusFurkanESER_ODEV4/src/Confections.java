import java.util.List;

public class Confections extends urun  {
	 private String kategoriAdi = " Confections";
	    private String detay;

	    public Confections(String ad, int KategoriIndex, double BirimAğirliki,  double BirimFiyati, int StokMiktari) {
	        super(ad,3, BirimAğirliki, BirimFiyati, StokMiktari );
	        this.detay = "Çok tatlı şekeri";
	    }
	    public void detayYazdir() {
	        System.out.println("Şekerleme: " + ad + ", Detay: " + detay);
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
}

import java.util.List;

public class Cereals extends urun {
	 private String kategoriAdi = "Cereals";
	    private String detay;

	    public Cereals(String ad, int KategoriIndex, double BirimAğirliki, double BirimFiyati, int StokMiktari) {
	        super(ad , 5, BirimAğirliki, BirimFiyati, StokMiktari);
	        this.detay = "Dünyanın en güzel tahılı.";
	    }
	    public void detayYazdir() {
	        System.out.println("Tahıl : " + ad + ", Detay: " + detay);
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
	        System.out.println("Enaz stok miktarına sahip ürün siliniyor : mercimek  " );
	        
	        
	    	
	    }
	    
}

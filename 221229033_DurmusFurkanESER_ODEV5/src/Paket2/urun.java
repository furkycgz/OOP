package Paket2;

import java.util.List;

public class urun {
	private String ad;
    private int  KategoriIndex;
    private double BirimAgirligi;
    private double BirimFiyat;
    private int StokMiktari;

    public urun(String ad, int KategoriIndex, double BirimAgirligi, double BirimFiyat, int StokMiktari) {
        this.ad = ad;
        this.KategoriIndex = KategoriIndex;
        this.BirimAgirligi = BirimAgirligi;
        this.BirimFiyat =  BirimFiyat;
        this.StokMiktari = StokMiktari;
    }
  
    private static void stokmiktarıort (List<urun> urunler) {
        double toplam = 0;
        int sayac = 0;

        for (urun urn : urunler) {
            toplam += urn.getStokMiktari();
            sayac++;
        }

        double ortalama =  toplam / sayac ;
        System.out.println("Stok miktarı ortalaması: " + ortalama);
    }
	
	private static void birimAğirlikimax(List<urun> urunler) {
		double maxdeger = 0 ; 
		for (urun urn : urunler) {
			if( urn.getBirimAgirligi() > maxdeger  ) {
				maxdeger = urn.getBirimAgirligi();
			}
			
		}
		System.out.println("Birim agirliki max : " + maxdeger  );
	}
    
	   public static void getstokmiktarıort (List<urun> urunler) {
	    	
		   stokmiktarıort (urunler);
	    	
	    }
    
	   public static void getbirimAğirlikimax(List<urun> urunler) {
	    	
		   birimAğirlikimax(urunler);
	    	
	    }
     
    
    
    
    
    
    
    
    
    protected String getAd() {
        return ad;
    }

    protected double getBirimAgirligi() {
        return BirimAgirligi;
    }

    protected double getBirimFiyati() {
        return BirimFiyat;
    }

    protected int getStokMiktari() {
        return StokMiktari ;
    }

    protected void setBirimFiyati(double yeniFiyat) {
        this.BirimFiyat = yeniFiyat;
    }

   
    
    
    
    
	
	
}

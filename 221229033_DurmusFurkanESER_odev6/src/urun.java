import java.util.List;

public class urun {
	
	String ad;
	int KategoriIndex ; 
	double BirimAğirliki ; 
	double BirimFiyati ; 
	int StokMiktari ;
	public urun(String ad, int kategoriIndex, double birimAğirliki, double birimFiyati, int stokMiktari) {
		super();
		this.ad = ad;
		KategoriIndex = kategoriIndex;
		BirimAğirliki = birimAğirliki;
		BirimFiyati = birimFiyati;
		StokMiktari = stokMiktari;
	}
	
	 // Stok ortalamasını hesaplama
    public double stokOrtalamasi(List<urun> urunler) {
    	 double toplam = 0;
         int sayac = 0;

         for (urun urn : urunler) {
             toplam += urn.StokMiktari;
             sayac++;
         }

         double ortalama =  toplam / sayac ;
         return ortalama ; 
    }
    public  void birimAğirlikimax(List<urun> urunler) {
        double maxdeger = 0;
        for (urun urn : urunler) {
            if (urn.BirimAğirliki > maxdeger) {
                maxdeger = urn.BirimAğirliki;
            }
        }
        System.out.println("Genel Birim Ağırlığı Max: " + maxdeger);
    }
    
    
    
    
    
    
    
}
	
	
	
	


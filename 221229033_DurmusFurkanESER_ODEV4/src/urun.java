import java.util.List;

public class urun {
	
	String ad;
	int KategoriIndex ; 
	double BirimAğirliki ; 
	double BirimFiyati ; 
	int StokMiktari ;
	public urun(String ad, int KategoriIndex, double BirimAğirliki, double BirimFiyati, int StokMiktari) {
		this.ad = ad;
		this.KategoriIndex = KategoriIndex;
		this.BirimAğirliki = BirimAğirliki;
		this.BirimFiyati = BirimFiyati;
		this.StokMiktari = StokMiktari;
	}
	
	
	
	
	public static void yazdır(List<urun> urunler ) {
		
		for (urun urn : urunler) {
			System.out.println("ad : " + urn.ad );
			System.out.println("KategoriIndex : " + urn.KategoriIndex );
			System.out.println("BirimAğirliki : " + urn.BirimAğirliki );
			System.out.println("BirimFiyati : " + urn.BirimFiyati );
			System.out.println("StokMiktari : " + urn.StokMiktari );
			System.out.println("-------------");
		}
		
	}
	
	public static void stokmiktarıort (List<urun> urunler) {
        double toplam = 0;
        int sayac = 0;

        for (urun urn : urunler) {
            toplam += urn.StokMiktari;
            sayac++;
        }

        double ortalama =  toplam / sayac ;
        System.out.println("Stok miktarı ortalaması: " + ortalama);
    }
	
	public static void birimAğirlikimax(List<urun> urunler) {
		double maxdeger = 0 ; 
		for (urun urn : urunler) {
			if( urn.BirimAğirliki > maxdeger  ) {
				maxdeger = urn.BirimAğirliki;
			}
			
		}
		System.out.println("Birim agirliki max : " + maxdeger  );
	}
}
    



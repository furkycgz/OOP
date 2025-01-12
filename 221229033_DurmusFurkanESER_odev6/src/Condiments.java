import java.util.List;

public class Condiments extends urun {
	 private String kategoriAdi = "Condiments";

	public Condiments(String ad, int kategoriIndex, double birimAğirliki, double birimFiyati, int stokMiktari) {
		super(ad, 2, birimAğirliki, birimFiyati, stokMiktari);
		
	}
	 @Override
	 public double stokOrtalamasi(List<urun> urunler) {
	     double toplam = 0;
	     int sayac = 0;

	     for (urun urn : urunler) {
	    	  if (urn.KategoriIndex == 2) { 
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
	         if (urn.KategoriIndex == 2 && urn.BirimAğirliki > maxdeger) {
	             maxdeger = urn.BirimAğirliki;
	         }
	     }
	     System.out.println("Condiments Birim Ağırlığı Max: " + maxdeger);
	 }
	   public static void ençokaindirim(List<Condiments> cesniler) {
	    	  double maxdeger = 0;
	    	  Condiments maxCesni = null;

	    
	    	    for (Condiments cdt : cesniler) {
	    	        if (cdt.StokMiktari > maxdeger) {
	    	            maxdeger = cdt.StokMiktari;
	    	            maxCesni = cdt;
	    	        }
	    	    }

	    	    if (maxCesni != null) {
	    	
	    	       
	    	        double yeniFiyat = maxCesni.BirimFiyati * 0.9;

	    	       

	    	   
	    	        System.out.println("Yüzde 10 indirim yapılan ürün: " + maxCesni.ad);
	    	        System.out.println(" Yeni Fiyat: " + yeniFiyat);
	    	    }
	    	}
	   //Overload
	   public static void ençokaindirim(List<urun> urunler, double minFiyat, double maxFiyat) {
		    double maxdeger = 0;
		    urun maxUrun = null;

		    for (urun urn : urunler) {
		        if (urn.BirimFiyati >= minFiyat && urn.BirimFiyati <= maxFiyat && urn.StokMiktari > maxdeger) {
		            maxdeger = urn.StokMiktari;
		            maxUrun = urn;
		        }
		    }

		    if (maxUrun != null) {
		    	System.out.println("girilen min fiyat = " + minFiyat);
		    	System.out.println("girilen max fiyat = " + maxFiyat);
		    	
		        double yeniFiyat = maxUrun.BirimFiyati * 0.9;
		        System.out.println("Yüzde 10 indirim yapılan ürün: " + maxUrun.ad);
		        System.out.println("Yeni Fiyat: " + yeniFiyat);
		    }
		}

	   

	   
	 
}

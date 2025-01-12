/*  package Paket1;

import Paket2.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class dosyaOku   {
	public static void Listele(String dosyaAdı,  List<urun> urunler , List<beverages> icecekler, List<Condiments> cesniler,List<Confections> sekerlemeler, List<DairyProducts> sutUrunleri, List<Cereals> tahillar) {
		try (BufferedReader br = new BufferedReader(new FileReader("ürünler.txt"))) {
		    String line; // okunan satırı tutmak için 
		   
		    while ((line = br.readLine()) != null) {
		    String[] dizi = line.split("\\s+"); // Birden fazla boşlukla ayır	
		    String ad = dizi[0];
		    int KategoriIndex = Integer.parseInt(dizi[1]);
		    double BirimAgirligi = Double.parseDouble(dizi[2]);
		    double BirimFiyat = Double.parseDouble(dizi[3]);
		    int StokMiktari = Integer.parseInt(dizi[4]);
		    System.out.println(line); //satırları yazar
		    urunler.add(new urun(ad, KategoriIndex, BirimAgirligi, BirimFiyat, StokMiktari));
		switch (KategoriIndex) {
		case 1:
		    icecekler.add(new beverages(ad, KategoriIndex, BirimAgirligi, BirimFiyat, StokMiktari));
		    
		    break;
		case 2:
		    cesniler.add(new Condiments(ad, KategoriIndex, BirimAgirligi, BirimFiyat, StokMiktari));
		    break;
		case 3:
		    sekerlemeler.add(new Confections(ad, KategoriIndex, BirimAgirligi, BirimFiyat, StokMiktari));
		    break;
		case 4:
		    sutUrunleri.add(new DairyProducts(ad, KategoriIndex, BirimAgirligi, BirimFiyat, StokMiktari));
		    break;
		case 5:
		    tahillar.add(new Cereals(ad, KategoriIndex, BirimAgirligi, BirimFiyat, StokMiktari));
		    break;

		  }

		}
		} catch (IOException e) {
		    e.printStackTrace();
		   }
		}
	
	

}
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
package Paket2;

import java.util.List;

public class beverages extends urun {
	
	  private String kategoriAdi = "Beverages";
	    private String detay = "Dünyanın en güzel içeceği";

	    public beverages(String ad, int KategoriIndex, double BirimAgirligi, double BirimFiyat, int StokMiktari) {
	        super( ad, KategoriIndex, BirimAgirligi, BirimFiyat,  StokMiktari);
	    }

	    private static void fiyatFarkı( List<beverages> icecekler) {
	    	double maxdeger = 0 ; 
			for (beverages ick : icecekler ) {
				if( ick.getBirimFiyati() > maxdeger  ) {
					maxdeger = ick.getBirimFiyati();
				}
			}	
	    	double mindeger = maxdeger ; 
	    	for (beverages ick1 : icecekler ) {
				if( ick1.getBirimFiyati() < mindeger  ) {
					mindeger = ick1.getBirimFiyati();
				}
	       }
	    	double fark = maxdeger - mindeger ; 
	    	System.out.println("fark = "+ fark );
	    }
	     
    
	    public static void getfiyatFarkı(List<beverages> icecekler) {
	    	fiyatFarkı(icecekler);
	    }
	    
	    
	    protected String getKategoriAdi() {
	        return kategoriAdi;
	    }

	    protected String getDetay() {
	        return detay;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
}	 
 package Paket2;

import java.util.List;

public class Condiments extends urun {
	 private String kategoriAdi = "Condiments";
	    private String detay;

	    public Condiments(String ad, int KategoriIndex, double BirimAgirligi, double BirimFiyat, int StokMiktari ) {
	        super(ad,KategoriIndex, BirimAgirligi, BirimFiyat, StokMiktari );
	       
	    }
	    public void detayYazdir() {
	        System.out.println("Çeşniler: " + getAd() + ", Detay: " + detay);
	    }
	    
	    
	    private static void ençokaindirim(List<Condiments> cesniler) {
	    	  double maxdeger = 0;
	    	  Condiments maxCesni = null;

	    
	    	    for (Condiments cdt : cesniler) {
	    	        if (cdt.getStokMiktari() > maxdeger) {
	    	            maxdeger = cdt.getStokMiktari();
	    	            maxCesni = cdt;
	    	        }
	    	    }

	    	    if (maxCesni != null) {
	    	
	    	       
	    	        double yeniFiyat = maxCesni.getBirimFiyati() * 0.9;

	    	       

	    	   
	    	        System.out.println("Yüzde 10 indirim yapılan ürün: " + maxCesni.getAd());
	    	        System.out.println(" Yeni Fiyat: " + yeniFiyat);
	    	    }
	    	}
	    public static void getençokaindirim(List<Condiments> cesniler) {
	    	
	    	ençokaindirim(cesniler);
	    	
	    }
	    protected String getKategoriAdi() {
	        return kategoriAdi;
	    }

	    protected String getDetay() {
	        return detay;
	    }
	    
	    
	    
}
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
package Paket2;

import java.util.List;

public class DairyProducts extends urun {
	 private String kategoriAdi = "DairyProducts";
	    private String detay;
	    
		public DairyProducts(String ad, int KategoriIndex, double BirimAgirligi, double BirimFiyat, int StokMiktari) {
			super(ad, KategoriIndex, BirimAgirligi, BirimFiyat, StokMiktari);
			
		}
       
		  public void detayYazdir() {
		        System.out.println("Süt ürünü: " + getAd() + ", Detay: " + detay);
		    }
	
		  private static void kacşişeedeceğinibul(List<DairyProducts> sutUrunleri) {
		    	// yoğunluk 1 aldım 
		    	double şişelt = 2.0 ;
		    	double lttop = 0 ;
		    	for (DairyProducts dpc : sutUrunleri) {
					lttop += dpc.getBirimAgirligi();
		    		
		       }
		    	 
		      double şişeSayisi = lttop / şişelt ; 	    	
		   
		      System.out.println("Gerekli şişe sayısı : " +Math.ceil(şişeSayisi) );
		      
		    } 
		  public static void getkacşişeedeceğinibul( List<DairyProducts> sutUrunleri  ) {
			  kacşişeedeceğinibul(sutUrunleri);
			  
		  }

		  protected String getKategoriAdi() {
		        return kategoriAdi;
		    }

		    protected String getDetay() {
		        return detay;
		    }	  
		  
		  
		  
}
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
import Paket1.dosyaOku;
import Paket2.*;

import java.util.*;

public class main {
    public static void main(String[] args) {
    	List<urun> urunler = new ArrayList<>();
        List<beverages> icecekler = new ArrayList<>();
        List<Condiments> cesniler = new ArrayList<>();
        List<Confections> sekerlemeler = new ArrayList<>();
        List<DairyProducts> sutUrunleri = new ArrayList<>();
        List<Cereals> tahillar = new ArrayList<>();

        dosyaOku.Listele("ürünler.txt", urunler , icecekler, cesniler, sekerlemeler, sutUrunleri, tahillar);

        Scanner scanner = new Scanner(System.in);
        int secim;
        boolean devam = true;

        while(devam) {
	        
            System.out.println("----- Menü -----");
            System.out.println("1. Tüm ürünlerin Stok miktarlarına göre ortalamasını al ");
            System.out.println("2. Tüm ürünlerden  Birim ağirliki en büyük olanı bul ");
            System.out.println("3. En pahalı ve en ucuz içeceğin fiyat farkını bul .");
            System.out.println("4. Stok miktarı en çok olan çeşninin birim fiyatına yüzde 10 indirim yap .");
            System.out.println("5. Her Şekerlemeye 2 tl zam yap");
            System.out.println("6. Toplam süt ürünlerini 2 litrelik kaç tane şişeye sığdırdığımızı bul .");
            System.out.println("7. En az stok miktarı olan Tahılı sil ");
            System.out.println("8. Çıkış");
            System.out.print("Seçiminiz: ");
            secim = scanner.nextInt();

            switch (secim) {
                case 1 :
                    
                	urun.getstokmiktarıort(urunler);
                 break;
                
                case 2 :
                	urun.getbirimAğirlikimax(urunler);
                  
                break;
                case 3 : 
                	 beverages.getfiyatFarkı(icecekler);
                   
                break;
                case 4:
                     Condiments.getençokaindirim(cesniler);
                break;
                case 5:
                	Confections.getşekereikitlzam(sekerlemeler);
                break;
                
                case 6 : 
                	
                	DairyProducts.getkacşişeedeceğinibul(sutUrunleri);
                break;	
                case 7 :
                    Cereals.getenazStokolanısil(tahillar);
                break;
                case 8 : System.out.println("Çıkış yapılıyor");
                devam = false ; 
                break;
            }
 }
    }
}
    */

import java.util.List;

/* import java.util.List;



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
-------------------------------------------------------------------------------------------------------------------------
import java.util.List;

public class beverages extends urun {
	 private String kategoriAdi = "beverages";
	 
  
 public beverages(String ad, int KategoriIndex, double BirimAğirliki, double BirimFiyati, int StokMiktari ) {
     super(ad,1, BirimAğirliki, BirimFiyati, StokMiktari );
    
    
  }
 @Override
 public double stokOrtalamasi(List<urun> urunler) {
     double toplam = 0;
     int sayac = 0;

     for (urun urn : urunler) {
    	  if (urn.KategoriIndex == 1) { 
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
         if (urn.KategoriIndex == 1 && urn.BirimAğirliki > maxdeger) {
             maxdeger = urn.BirimAğirliki;
         }
     }
     System.out.println("Beverages Birim Ağırlığı Max: " + maxdeger);
 }
 
 public static void fiyatFarkı( List<beverages> icecekler) {
 	double maxdeger = 0 ; 
		for (beverages ick : icecekler ) {
			if( ick.BirimFiyati > maxdeger  ) {
				maxdeger = ick.BirimFiyati;
			}
		}	
 	double mindeger = maxdeger ; 
 	for (beverages ick1 : icecekler ) {
			if( ick1.BirimFiyati < mindeger  ) {
				mindeger = ick1.BirimFiyati;
			}
    }
 	double fark = maxdeger - mindeger ; 
 	System.out.println("fark = "+ fark );
 }
 // Overload
 public static void fiyatFarkı(List<beverages> icecekler,List<urun> urunler) {
	    double maxdeger = 0;
	    for (urun urn : urunler) {
	        if (urn.BirimFiyati > maxdeger) {
	            maxdeger = urn.BirimFiyati;
	        }
	    }
	    double mindeger = maxdeger;
	    for (urun urn1 : urunler) {
	        if (urn1.BirimFiyati < mindeger) {
	            mindeger = urn1.BirimFiyati;
	        }
	    }
	    double fark = maxdeger - mindeger;
	    System.out.println("Genel ürünler için fiyat farkı = " + fark);
	}

 
 
 
 
 
}
---------------------------------------------------------------------------------------------
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
---------------------------------------------------------------------------------------------------
import java.util.List;

public class Confections extends urun {
	private String kategoriAdi = " Confections";
  

    public Confections(String ad, int KategoriIndex, double BirimAğirliki,  double BirimFiyati, int StokMiktari) {
        super(ad,3, BirimAğirliki, BirimFiyati, StokMiktari );
       
    }
    @Override
	 public double stokOrtalamasi(List<urun> urunler) {
	     double toplam = 0;
	     int sayac = 0;

	     for (urun urn : urunler) {
	    	  if (urn.KategoriIndex == 3) { 
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
            if (urn.KategoriIndex == 3 && urn.BirimAğirliki > maxdeger) {
                maxdeger = urn.BirimAğirliki;
            }
        }
        System.out.println("şekerleme Birim Ağırlığı Max: " + maxdeger);
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
    //Overload
    public static void şekereikitlzam(List<Confections> sekerlemeler, int minStok) {
        for (Confections cft : sekerlemeler) {
            if (cft.StokMiktari < minStok) {
            System.out.println("Stok miktarı Min stok miktarından az olan şekerlemeler 10 tl zam olursa güncellenmiş fiyatları : ");
            cft.BirimFiyati += 10;  
            System.out.println("Ad: " + cft.ad + ", Yeni Fiyat: " + cft.BirimFiyati);
            }
               
            
        }

       
    }


	   

}
-----------------------------------------------------------------------------------------------
import java.util.List;

public class DairyProducts extends urun {
   
	 private String kategoriAdi = "DairyProducts";
	   

	    public  DairyProducts(String ad, int KategoriIndex, double BirimAğirliki, double BirimFiyati, int StokMiktari) {
	        super(ad, 4, BirimAğirliki, BirimFiyati, StokMiktari );
	       
	    }
	    @Override
		 public double stokOrtalamasi(List<urun> urunler) {
		     double toplam = 0;
		     int sayac = 0;

		     for (urun urn : urunler) {
		    	  if (urn.KategoriIndex == 4) { 
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
	            if (urn.KategoriIndex == 4 && urn.BirimAğirliki > maxdeger) {
	                maxdeger = urn.BirimAğirliki;
	            }
	        }
	        System.out.println("Süt ürünleri  Birim Ağırlığı Max: " + maxdeger);
	    }
	    public static void kacşişeedeceğinibul(List<DairyProducts> sutUrunleri) {
	    	// yoğunluk 1 aldım 
	    	double şişelt = 2.0 ;
	    	double lttop = 0 ;
	    	for (DairyProducts dpc : sutUrunleri) {
				lttop += dpc.BirimAğirliki;
	    		
	       }
	    	 
	      double şişeSayisi = lttop / şişelt ; 	    	
	   
	      System.out.println("Gerekli şişe sayısı : " +Math.ceil(şişeSayisi) );
	      
	    } 
	    // Overload
	    public static void kacşişeedeceğinibul(List<DairyProducts> sutUrunleri, int yogunluk) {
	    	// yoğunluk 1 aldım 
	    	double şişelt = 2.0 ;
	    	double agırlık = 0 ;
	    	for (DairyProducts dpc : sutUrunleri) {
				agırlık += dpc.BirimAğirliki;
	    		
	       }
	    	double yeniAgırlık = agırlık * yogunluk ; 
	    	 
	      double şişeSayisi = yeniAgırlık / şişelt ; 	    	
	   
	      System.out.println("Girilen yogunluğa göre yeni şişe  sayısı : " +Math.ceil(şişeSayisi) );
	      
	    } 
	    

		   

}
------------------------------------------------------------------------------------------------------
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
---------------------------------------------------------------------------------------------------
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testetme {
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
	public static void main(String[] args) {
		    List<urun> urunler = new ArrayList<>();
		    List<beverages> icecekler = new ArrayList<>();
	        List<Condiments> cesniler = new ArrayList<>();
	        List<Confections> sekerlemeler = new ArrayList<>();
	        List<DairyProducts> sutUrunleri = new ArrayList<>();
	        List<Cereals> tahillar = new ArrayList<>();

	        Testetme.Listele("ürünler.txt", urunler , icecekler, cesniler, sekerlemeler, sutUrunleri, tahillar);
	        
	        boolean devam = true;
	        Scanner scanner = new Scanner(System.in);
	        int secim;
	        
	      
	     
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
	            urun genelUrunler = new urun("", 0, 0, 0, 0);
	            beverages icecek = new beverages("", 0, 0, 0, 0);
	            Condiments çeşni = new Condiments("", 0, 0, 0, 0);
	            Confections şekerleme = new Confections("", 0, 0, 0, 0);
	            DairyProducts sütÜrünü = new DairyProducts("", 0, 0, 0, 0);
	            Cereals tahıl = new Cereals("", 0, 0, 0, 0);

	            switch (secim) {
	                case 1 :
	                	
	                    System.out.println("Genel stok ortalaması: " + genelUrunler.stokOrtalamasi(urunler));
	                   
	                   
	                    System.out.println("İçecek stok ortalaması: " + icecek.stokOrtalamasi(urunler));
	                    
	                 
	                    System.out.println("Çeşni stok ortalaması: " + çeşni.stokOrtalamasi(urunler));
	                    
	                   
	                    System.out.println("Şekerleme stok ortalaması: " + şekerleme.stokOrtalamasi(urunler));
	                    
	                   
	                    System.out.println("Süt ürünleri stok ortalaması: " + sütÜrünü.stokOrtalamasi(urunler));
	                    
	                    
	                  
	                    System.out.println("Tahıllar  stok ortalaması: " + tahıl.stokOrtalamasi(urunler));
	                 break;
	                
	                case 2 :
	             
	                  genelUrunler.birimAğirlikimax(urunler);
	                  icecek.birimAğirlikimax(urunler);
	                  çeşni.birimAğirlikimax(urunler);
	                  şekerleme.birimAğirlikimax(urunler);
	                  sütÜrünü.birimAğirlikimax(urunler);
	                  tahıl.birimAğirlikimax(urunler);
	                  
	                break;
	                case 3 : 
	                    beverages.fiyatFarkı(icecekler);
	                    beverages.fiyatFarkı(icecekler, urunler);
	                   
	                break;
	                case 4:
	                   Condiments.ençokaindirim(cesniler);
	                   Condiments.ençokaindirim(urunler, 5.0, 10.0);
	                break;
	                case 5:
	                	Confections.şekereikitlzam(sekerlemeler);
	                	Confections.şekereikitlzam(sekerlemeler,100);
	                break;
	                
	                case 6 : 
	                	DairyProducts.kacşişeedeceğinibul(sutUrunleri);
	                	DairyProducts.kacşişeedeceğinibul(sutUrunleri, 3 );
	                	
	                break;	
	                case 7 :
	                    Cereals.enazStokolanısil(tahillar);
	                    Cereals.enazStokolanısil(tahillar, 100);
	                break;
	                case 8 : System.out.println("Çıkış yapılıyor");
	                devam = false ; 
	                break;
	            }
	 }

   }

	}

*/		
	
	
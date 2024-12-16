
public class Tümsiniflar22_33 {
/*	import java.util.List;

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
			System.out.println("Birim agirliki max : " +maxdeger  );
		}
	}
	    
	import java.io.*;
	import java.util.*;

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
	    System.out.println(line);
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
		        
		        urun.yazdır(urunler); 
		     
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
		                      urun.stokmiktarıort(urunler);
		                 break;
		                
		                case 2 :
		                	urun.birimAğirlikimax(urunler);
		                  
		                break;
		                case 3 : 
		                   beverages.fiyatFarkı(icecekler);
		                
		                break;
		                case 4:
		                     Condiments.ençokaindirim(cesniler);
		                break;
		                case 5:
		                	Confections.şekereikitlzam(sekerlemeler);
		                break;
		                
		                case 6 : 
		                	
		                	DairyProducts.kacşişeedeceğinibul(sutUrunleri);
		                break;	
		                case 7 :
		                      Cereals.enazStokolanısil(tahillar);
		                break;
		                case 8 : System.out.println("Çıkış yapılıyor");
		                break;
		            }
		 }

	   }

		
	}
	import java.util.List;

	public class beverages extends urun {
		 private String kategoriAdi = "beverages";
		    private String detay;
	     
	    public beverages(String ad, int KategoriIndex, double BirimAğirliki, double BirimFiyati, int StokMiktari ) {
	        super(ad,1, BirimAğirliki, BirimFiyati, StokMiktari );
	        this.detay = "Dünyanın en güzel içeceği";
	       
	     }
	    public void detayYazdir() {
	        System.out.println("içecekler: " + ad + ", Detay: " + detay);
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
	     
	 }
	public class Condiments extends urun {
		 private String kategoriAdi = "Condiments";
		    private String detay;

		    public Condiments(String ad, int KategoriIndex, double BirimAğirliki, double BirimFiyati, int StokMiktari ) {
		        super(ad,2, BirimAğirliki, BirimFiyati, StokMiktari );
		        this.detay = "Mümekkemmel çeşni...";
		    }
		    public void detayYazdir() {
		        System.out.println("Çeşniler: " + ad + ", Detay: " + detay);
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
	}
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
	import java.util.List;

	public class DairyProducts extends urun {
		 private String kategoriAdi = "DairyProducts";
		    private String detay;
	 
		    public  DairyProducts(String ad, int KategoriIndex, double BirimAğirliki, double BirimFiyati, int StokMiktari) {
		        super(ad, 4, BirimAğirliki, BirimFiyati, StokMiktari );
		        this.detay = "Dünyanın en güzel sütü .";
		    }
		    public void detayYazdir() {
		        System.out.println("Süt ürünü: " + ad + ", Detay: " + detay);
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
		    
	}
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
		        System.out.println("Enaz stok miktarına sahip ürün siliniyor : " + silinecek);
		        
		        
		    	
		    }
		    
	}
*/


	
}

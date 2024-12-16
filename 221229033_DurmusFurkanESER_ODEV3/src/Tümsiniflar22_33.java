import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Tümsiniflar22_33 {
	public class URUN {
		
		String ad;
	    int kategoriIndex;
	    String birimAgirligi;
	    double birimFiyati;
	    double stokMiktari;

	    public URUN(String ad, int kategoriIndex, String birimAgirligi, double birimFiyati, double stokMiktari) {
	        this.ad = ad;
	        this.kategoriIndex = kategoriIndex;
	        this.birimAgirligi = birimAgirligi;
	        this.birimFiyati = birimFiyati;
	        this.stokMiktari = stokMiktari;
	    }

	 
	    void print() {
	        System.out.println("================");
	        System.out.println("AD: " + this.ad);
	        System.out.println("kategoriIndex: " + this.kategoriIndex);
	        System.out.println("birimAgirligi: " + this.birimAgirligi);
	        System.out.println("birimFiyati: " + this.birimFiyati);
	        System.out.println("stokMiktari: " + this.stokMiktari);
	        
	        
	    }
		
		
		
		
		
		
		
	    
	    public static void listeOlustur() {
	        System.out.println("Liste oluştu");
	    }

	    public static void yeniKategoriListesiOlustur(List<URUN> urunList, int A) {
	    	List<URUN> yenikategoriList = new ArrayList<>();
	    	  for (URUN urn : urunList) {
	              if (urn.stokMiktari > A) {
	                  yenikategoriList.add(urn);
	                  System.out.println("KategoriIndex: " + urn.kategoriIndex);
	                  System.out.println("adet: " + urn.stokMiktari);
	              }
	          }
	    	
	    	
	    	
	    	
	        System.out.println("Yeni kategori listesi oluşturuldu.");
	    }

	    public static void birimFiyatGuncelle(List<URUN> urunList) {
	    	double deger=0 ;
	    	for (URUN urn : urunList) {
	    	   deger = deger + urn.birimFiyati ; 
	    	  }
	    	 double ort = deger / urunList.size() ;
	        System.out.println("Ortalama Birim Fiyatı: " + ort);
	        double deger2=0 ; 
	        double sallamabirdeger = 100;
	        URUN enyakın = null ; 
	    	for (URUN urn : urunList) {
				deger2 = urn.birimFiyati - ort ;  
				Math.abs(deger2);	
				if(deger2<sallamabirdeger) {
					
					sallamabirdeger=deger2;
					enyakın=urn;
					
				}
			}  
	    	double güncelbirimfiyat = enyakın.birimFiyati * 0.90 ;  
	    	
	    	System.out.print("güncellenen : "  +enyakın.ad   );
	    	System.out.print("güncel % 10 indirimli fiyat :" + enyakın.birimFiyati);
	        System.out.println("Birim fiyat güncellendi.");
	    }

	    public static void yeniUrunEkle(List<URUN> urunList) {
	    	URUN enazstok = null ;
	    	double sallamabirdeger = 100;
	    	for (URUN urn : urunList) {
	              if(urn.stokMiktari<sallamabirdeger) {
					
					sallamabirdeger=urn.stokMiktari;
					enazstok=urn;
					
				}
	      	  }
	    	 System.out.println("en az stoklu ürün :  "+enazstok );
	    	 urunList.remove(enazstok);
	    	
	    	double deger = 0 ;
	    	for (URUN urn : urunList) {
	     	   deger = deger + urn.birimFiyati ; 
	     	  }
	     	 double ort = deger / urunList.size() ;
	    	
	     	double deger2 = 0 ;
	    	for (URUN urn : urunList) {
	     	   deger2 = deger2 + urn.stokMiktari ; 
	     	  }
	     	 double ort2 = deger2 / urunList.size() ;
	     	 
	    	
	    	urunList.add(new URUN("yeniUrun_X" , 1," 10 boxes", ort , ort2  ));
	    	
	    	
	    	for (URUN urun : urunList) {
				urun.print();
			}
	    	
	    	System.out.println("Yeni ürün eklendi.");
	    }

	    public static void urunleriSil(List<URUN> urunList) {
	    	List<URUN> silinecekler = new ArrayList<>();
	    	for (URUN urn : urunList) {
				if(urn.stokMiktari==0) {
					
					 silinecekler.add(urn);
					
					
				}
			}
	    	urunList.removeAll(silinecekler);
	    	System.out.println("kalan ürün sayisi : "+urunList.size());
	    	for (URUN urun : urunList) {
				urun.print();
			}
	    	
	    	
	    	
	        System.out.println("Ürünler silindi.");
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	   
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean devam = true;
	    	List<URUN> urunList = new ArrayList<>();
	        while (devam) {
	            // Menü seçeneklerini göster
	            System.out.println("Lütfen bir seçenek seçiniz:");
	            System.out.println("1: ListeOlustur");
	            System.out.println("2: YeniKategoriListesiOlustur");
	            System.out.println("3: BirimFiyatGuncelle");
	            System.out.println("4: YeniUrunEkle");
	            System.out.println("5: UrunleriSil");
	            System.out.println("6: Cıkış");

	            
	            int secim = scanner.nextInt();
	            
	           
	            switch (secim) {
	                case 1:
	              
	                	  urunList.add(new URUN( "Chai" , 1," 10 boxes x 20 bags", 18 , 39 ));
	                   	  urunList.add(new URUN("Chang" ,1  , "24 - 12 oz bottles\r\n" ,19  ,17 ));
	                   	  urunList.add(new URUN("Aniseed Syrup", 2 ,"12 - 550 ml bottles", 10 ,13));
	                   	  urunList.add(new URUN("Chef Anton's Cajun Seasoning",2  , "48 - 6 oz jars", 22 , 53 ));
	                   	  urunList.add(new URUN("Chef Anton's Gumbo Mix" ,2  , "36 boxes" , 21.35 , 0 ));
	                   	  urunList.add(new URUN("Grandma's Boysenberry Spread" , 2 , "12 - 8 oz jars" , 25 , 120 ));
	                   	  urunList.add(new URUN("Uncle Bob's Organic Dried Pears", 5 , "12 - 1 lb pkgs" ,30  , 15 ));
	                   	  urunList.add(new URUN("Northwoods Cranberry Sauce" , 2 , "12 - 12 oz jars" ,40  ,0));
	                   	  urunList.add(new URUN("Mishi Kobe Niku", 4 ,"18 - 500 g pkgs" , 97 ,29  ));
	                   	  urunList.add(new URUN("Ikura\r\n",5  , "12 - 200 ml jars", 31 , 31));
	                   	  urunList.add(new URUN("Queso Cabrales",4, "1 kg pkg", 21 ,22 ));
	                   	  urunList.add(new URUN("Queso Manchego La Pastora",4  , "10 - 500 g pkgs.",38  ,86  ));
	                   	  urunList.add(new URUN("Konbu", 3 , "2 kg box ", 6 , 24 ));
	                   	  urunList.add(new URUN("Tofu" , 5 , "40 - 100 g pkgs",23.25  ,35  ));
	                   	  urunList.add(new URUN("Genen Shouyu", 22 ,"24 - 250 ml bottles", 15.5 ,39  ));
	                   	  urunList.add(new URUN("Pavlova", 3 , "32 - 500 g boxes",17.45  ,29  ));
	                   	  urunList.add(new URUN("Alice Mutton",5  , "20 - 1 kg tins", 39 , 0 ));
	                   	  urunList.add(new URUN("Carnarvon Tigers",5  , "16 kg pkg",62.5  ,42  ));
	                   	  urunList.add(new URUN("Teatime Chocolate Biscuits",3  , "10 boxes x 12 pieces",9.2  ,25  ));
	                   	  urunList.add(new URUN("Sir Rodney's Marmalade", 3 , "30 gift boxes",81  ,40  ));
	                   	  urunList.add(new URUN("Sir Rodney's Scones",3  , "24 pkgs. x 4 pieces",10  ,3  ));
	                   	  urunList.add(new URUN("Gustaf's Knäckebröd",5  , "24 - 500 g pkgs",21  ,104  ));
	                   	  urunList.add(new URUN("Tunnbröd", 5 , "12 - 250 g pkgs",9  ,61  ));
	                   	  urunList.add(new URUN("Guaraná Fantástica", 1 , "12 - 355 ml cans",4.5  ,20  ));
	                	  urunList.add(new URUN("NuNuCa Nuß-Nougat-Creme", 3 , "20 - 450 g glasses",14  ,0 ));
	                	

	          	        try {
	          	            
	          	            FileWriter writer = new FileWriter("URUN.txt");

	          	            
	          	            for (URUN urn : urunList) {
	          	                
	          	                writer.write("================\n");
	          	              
	          	                writer.write("Ad : " + urn.ad + "\n");
	          	                writer.write("KategoriIndex  :" + urn.kategoriIndex + "\n");
	          	                writer.write("BirimAgirligi: " + urn.birimAgirligi + "\n");
	          	                writer.write("BirimFiyatı : " + urn.birimFiyati + "\n");
	          	                writer.write("StokMiktari : " + urn.stokMiktari + "\n");
	          	              

	          	                
	          	                urn.print();
	          	            }
	          	            writer.close();
	          	            System.out.println("Dosya başarıyla oluşturuldu.");
	          	        } catch (IOException e) {
	          	            System.out.println("Dosya oluşturulurken bir hata oluştu.");
	          	            e.printStackTrace();
	          	        }
	                	  
	                	
	                  
	                    listeOlustur();
	                    break;
	                case 2:
	                    
	                	Scanner input = new Scanner(System.in);
	                	System.out.println("bir A değeri giriniz : ");
	                	int A = input.nextInt();
	                	yeniKategoriListesiOlustur(urunList, A);
	                    break;
	                case 3:
	                    
	                    birimFiyatGuncelle( urunList);
	                    break;
	                case 4:
	                    
	                    yeniUrunEkle( urunList);
	                    
	                    break;
	                case 5:
	                    
	                    urunleriSil(urunList);
	                    break;
	                case 6:
	                    
	                    System.out.println("Menüden çıkılıyor...");
	                    devam = false; 
	                    break;
	                default:
	                    System.out.println("Geçersiz seçenek, lütfen tekrar deneyin.");
	                    break;
	            }
	        }
	      
	    }

	  
	}

	
	
}

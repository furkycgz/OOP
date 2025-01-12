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



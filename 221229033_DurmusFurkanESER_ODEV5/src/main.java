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

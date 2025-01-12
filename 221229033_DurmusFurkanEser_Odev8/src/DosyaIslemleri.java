import java.io.*;
import java.util.*;

public class DosyaIslemleri {

    
    public static class Urun {
        String ad;
        int kategoriIndex;
        double birimAgirligi;
        double birimFiyati;
        int stokMiktari;

        public Urun(String ad, int kategoriIndex, double birimAgirligi, double birimFiyati, int stokMiktari) {
            this.ad = ad;
            this.kategoriIndex = kategoriIndex;
            this.birimAgirligi = birimAgirligi;
            this.birimFiyati = birimFiyati;
            this.stokMiktari = stokMiktari;
        }

    
        public String toString() {
            return ad + " " + kategoriIndex + " " + birimAgirligi + " " + birimFiyati + " " + stokMiktari;
        }
    }

  
    public static class Beverages extends Urun {
        public Beverages(String ad,int kategoriIndex, double birimAgirligi, double birimFiyati, int stokMiktari) {
            super(ad, 1, birimAgirligi, birimFiyati, stokMiktari);
        }

        public static void stokOrtalamasi(List<Beverages> icecekler) {
            double toplam = 0;
            for (Beverages b : icecekler) {
                toplam += b.stokMiktari;
            }
            double ort = toplam / icecekler.size();
            System.out.println("İçecek stok ortalaması: " + ort);
        }
    }

    public static class Condiments extends Urun {
        public Condiments(String ad,int kategoriIndex, double birimAgirligi, double birimFiyati, int stokMiktari) {
            super(ad, 2, birimAgirligi, birimFiyati, stokMiktari);
        }
        

        public static void indirimUygula(List<Condiments> cesniler) {
        	 for (Condiments c : cesniler) {
                 System.out.println("İndirimsiz Fiyatlar : " + c.birimFiyati );
             }
        	for (Condiments c : cesniler) {
                c.birimFiyati *= 0.9;
            }
            System.out.println("Çeşnilerde yüzde 10 indirim uygulandı.");
            for (Condiments c : cesniler) {
                System.out.println("İndirimli Fiyatlar : " + c.birimFiyati );
            }
        }
      
    }

    public static class Confections extends Urun {
        public Confections(String ad,int kategoriIndex, double birimAgirligi, double birimFiyati, int stokMiktari) {
            super(ad, 3, birimAgirligi, birimFiyati, stokMiktari);
        }

        public static void fiyatArttir(List<Confections> sekerlemeler) {
            for (Confections c : sekerlemeler) {
                c.birimFiyati += 2;
            }
            System.out.println("Tüm şekerlemelere 2 TL zam yapıldı.");
            for (Confections c : sekerlemeler) {
             System.out.println("Zamlı Fiyatlar : "+ c.birimFiyati );
            }
        }
    }

    public static class DairyProducts extends Urun {
        public DairyProducts(String ad,int kategoriIndex, double birimAgirligi, double birimFiyati, int stokMiktari) {
            super(ad, 4, birimAgirligi, birimFiyati, stokMiktari);
        }

        public static void kacSiseGerekir(List<DairyProducts> sutUrunleri) {
            double toplamAgirlik = 0;
            for (DairyProducts d : sutUrunleri) {
                toplamAgirlik += d.birimAgirligi;
            }
            double sisaSayisi = Math.ceil(toplamAgirlik / 2);
            System.out.println("2 litrelik şişelerde gereken toplam şişe sayısı: " + sisaSayisi);
        }
    }

    public static class Cereals extends Urun {
        public Cereals(String ad,int kategoriIndex, double birimAgirligi, double birimFiyati, int stokMiktari) {
            super(ad, 5, birimAgirligi, birimFiyati, stokMiktari);
        }

        public static void enAzStokSil(List<Cereals> tahillar) {
            Urun enAzStokUrun = null;
            int minStok = 100;
            for (Urun u : tahillar) {
                if (u.stokMiktari < minStok) {
                    minStok = u.stokMiktari;
                    enAzStokUrun = u;
                }
            }
            if (enAzStokUrun != null) {
                tahillar.remove(enAzStokUrun);
                System.out.println("Stok miktarı en az olan tahıl silindi: " + enAzStokUrun.ad);
            }
        }
    }

    
    public static class DosyaOkuma {
        public static void listeleriOlustur(String ürünler, List<Beverages> icecekler, List<Condiments> cesniler,List<Confections> sekerlemeler, List<DairyProducts> sutUrunleri,List<Cereals> tahillar) throws IOException {
        	try (BufferedReader br = new BufferedReader(new FileReader("ürünler.txt"))) {
        	    String line; // okunan satırı tutmak için 
        	   
        	    while ((line = br.readLine()) != null) {
        	    String[] dizi = line.split("\\s+"); // Birden fazla boşlukla ayır	
        	    String ad = dizi[0];
        	    int kategoriIndex = Integer.parseInt(dizi[1]);
        	    double birimAgirligi = Double.parseDouble(dizi[2]);
        	    double birimFiyati = Double.parseDouble(dizi[3]);
        	    int stokMiktari = Integer.parseInt(dizi[4]);
        	    System.out.println(line); //satırları yazar
        	   
        	switch (kategoriIndex) {
        	case 1:
        	    icecekler.add(new Beverages(ad, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari));
        	    
        	    break;
        	case 2:
        	    cesniler.add(new Condiments(ad, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari));
        	    break;
        	case 3:
        	    sekerlemeler.add(new Confections(ad, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari));
        	    break;
        	case 4:
        	    sutUrunleri.add(new DairyProducts(ad, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari));
        	    break;
        	case 5:
        	    tahillar.add(new Cereals(ad, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari));
        	    break;

        	  }

        	}
        	} catch (IOException e) {
        	    e.printStackTrace();
        	   }
        	}
    }

    public static class DosyayaYazma {
        public static void listeyiYaz(String ürünler1, List<Beverages> icecekler, List<Condiments> cesniler,List<Confections> sekerlemeler, List<DairyProducts> sutUrunleri,List<Cereals> tahillar) throws IOException {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("ürünler1"))) {
                for (Urun i : icecekler) {
                    bw.write(i.toString());
                    bw.newLine();
                }
                for (Urun c : cesniler) {
                    bw.write(c.toString());
                    bw.newLine();
                }
                for (Urun s : sekerlemeler) {
                    bw.write(s.toString());
                    bw.newLine();
                }
                for (Urun sut : sutUrunleri) {
                    bw.write(sut.toString());
                    bw.newLine();
                }
                for (Urun t : tahillar) {
                    bw.write(t.toString());
                    bw.newLine();
                }
                
            }
          
        }
    }

    // Main
    public static void main(String[] args) throws IOException {
        List<Beverages> icecekler = new ArrayList<>();
        List<Condiments> cesniler = new ArrayList<>();
        List<Confections> sekerlemeler = new ArrayList<>();
        List<DairyProducts> sutUrunleri = new ArrayList<>();
        List<Cereals> tahillar = new ArrayList<>();

        DosyaOkuma.listeleriOlustur("ürünler.txt", icecekler, cesniler, sekerlemeler, sutUrunleri, tahillar);
        DosyayaYazma.listeyiYaz("ürünler1", icecekler, cesniler, sekerlemeler, sutUrunleri, tahillar);
        boolean devam = true;
        Scanner scanner = new Scanner(System.in);

        while (devam) {
            System.out.println("----- Menü -----");
            System.out.println("1. İçecek stok ortalaması");
            System.out.println("2. Çeşni indirim");
            System.out.println("3. Şekerleme zam yap");
            System.out.println("4. Süt ürünü için kaç şişe gerekli olduğunu bul ");
            System.out.println("5. Tahıl en az stok sil");
            System.out.println("6. Çıkış");
            System.out.print("Seçiminiz: ");
            int secim = scanner.nextInt();

            switch (secim) {
            case 1 :
            	Beverages.stokOrtalamasi(icecekler);
            break;
          
           case 2 :
        	   Condiments.indirimUygula(cesniler);
            
            break;
           case 3 : 
        	   Confections.fiyatArttir(sekerlemeler);
           break;
           case 4:
        	   DairyProducts.kacSiseGerekir(sutUrunleri);
           break;
           case 5:  
        	   Cereals.enAzStokSil(tahillar);
           break;
           case 6:
        	   System.out.println("Çıkış yapılıyor");
               devam = false ; 
           break;
            }
        }
    }
}

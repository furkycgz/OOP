import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Araçları yükle (dosyadan okuma işlemi burada yapılacak)
            AracYönetici.araclariYukle();  // Bu metod, araçları listeye ekler

            // Listeler
            List<Arac> genelListe = AracYönetici.araclariGetir();  // Artık araçlar burada yüklü olacak
            List<Benzin> benzinliListe = new ArrayList<>();
            List<Dizel> dizelListe = new ArrayList<>();
            List<Elektrik> elektrikliListe = new ArrayList<>();

            // Farklı türlerdeki araçları ilgili listeye ekleyelim
            for (Arac arac : genelListe) {
                if (arac instanceof Benzin) {
                    benzinliListe.add((Benzin) arac);
                } else if (arac instanceof Dizel) {
                    dizelListe.add((Dizel) arac);
                } else if (arac instanceof Elektrik) {
                    elektrikliListe.add((Elektrik) arac);
                }
            }

            System.out.println("     ESER RENT A CAR    ");
            System.out.println("      Hoşgeldiniz        ");
            System.out.println("Genel Araç Listesimiz:");
            genelListe.forEach(System.out::println);

            System.out.println("\nBenzinli Araçlar:");
            benzinliListe.forEach(System.out::println);

            System.out.println("\nDizel Araçlar:");
            dizelListe.forEach(System.out::println);

            System.out.println("\nElektrikli Araçlar:");
            elektrikliListe.forEach(System.out::println);

            System.out.print("\nKiralayacağınız aracın sıra  numarasını giriniz: ");
            int secim = input.nextInt();

            if (secim < 1 || secim > genelListe.size()) {
                System.out.println("Geçersiz seçim!");
                return;
            }

            Arac secilenArac = genelListe.get(secim - 1);

            System.out.print("Kaç gün araç kiralayacaksınız? ");
            int gunSayisi = input.nextInt();

            int toplamFiyat = secilenArac.getUcret() * gunSayisi;
            System.out.println("\nToplam fiyat: " + toplamFiyat + " TL");

            // YAKIT ALARMI
            System.out.println("\nYAKIT İHTİYACI OLAN ARAÇLAR : ");
            Arac.YakıtAlarm(genelListe);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


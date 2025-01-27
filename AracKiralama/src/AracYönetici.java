import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class AracYönetici {
    // Araçları tutacak genel liste
    private static List<Arac> genelListe = new ArrayList<>();

    // Dosyadan araçları okuma ve listeye ekleme
    public static void araclariYukle() {
        // Eğer liste boşsa, dosyadan araçları ekleyelim
        if (genelListe.isEmpty()) {
            try (BufferedReader br = new BufferedReader(new FileReader("Araç.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] parts = line.split(", ");
                    int sıra = Integer.parseInt(parts[0]);
                    String plaka = parts[1];
                    String markaModel = parts[2];
                    String yakıtTuru = parts[3];
                    String vitesTuru = parts[4];
                    int ucret = Integer.parseInt(parts[5]);
                    String durum = parts[6];
                    int kalanKm = Integer.parseInt(parts[7].split(" ")[0]);

                    // Yakıt türüne göre araçları oluşturup listeye ekliyoruz
                    switch (yakıtTuru.toLowerCase()) {
                        case "benzin":
                            Benzin benzinliArac = new Benzin(sıra, plaka, markaModel, yakıtTuru, vitesTuru, ucret, durum, kalanKm);
                            genelListe.add(benzinliArac);
                            break;
                        case "dizel":
                            Dizel dizelArac = new Dizel(sıra, plaka, markaModel, yakıtTuru, vitesTuru, ucret, durum, kalanKm);
                            genelListe.add(dizelArac);
                            break;
                        case "elektrikli":
                            Elektrik elektrikliArac = new Elektrik(sıra, plaka, markaModel, yakıtTuru, vitesTuru, ucret, durum, kalanKm);
                            genelListe.add(elektrikliArac);
                            break;
                        default:
                            System.out.println("Bilinmeyen yakıt türü: " + yakıtTuru);
                    }
                }
            } catch (IOException e) {
                System.err.println("Dosya okuma hatası: " + e.getMessage());
            }
        }
    }

    // Genel listeyi döndüren metod
    public static List<Arac> araclariGetir() {
        return genelListe;
    }
}

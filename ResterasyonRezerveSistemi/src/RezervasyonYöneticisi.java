import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class RezervasyonYonetici {
    private List<Rezervasyon> rezervasyonlar;
    private final String dosyaYolu = "rezervasyonlar.txt";
    private List<Integer> silinenIdler; // Silinen id'leri tutmak için

    public RezervasyonYonetici() {
        rezervasyonlar = new ArrayList<>();
        silinenIdler = new ArrayList<>();
        dosyadanRezervasyonlariYukle();
    }

    public void rezervasyonEkle(String musteriAdi, String musteriSoyadi, LocalDateTime rezervasyonZamani) {
        int yeniId;
        if (silinenIdler.isEmpty()) {
            yeniId = rezervasyonlar.size() + 1; // Eğer silinen id yoksa, sıradaki yeni id'yi kullan
        } else {
            yeniId = silinenIdler.remove(0); // Silinen id'yi al
        }
        Rezervasyon rezervasyon = new Rezervasyon(yeniId, musteriAdi, musteriSoyadi, rezervasyonZamani);
        rezervasyonlar.add(rezervasyon);
        dosyayaKaydet();
    }

    public void rezervasyonlariListele() {
        if (rezervasyonlar.isEmpty()) {
            System.out.println("Henüz bir rezervasyon yok.");
        } else {
            for (Rezervasyon rezervasyon : rezervasyonlar) {
                System.out.println(rezervasyon);
            }
        }
    }

    public void rezervasyonSil(int id) {
        Optional<Rezervasyon> rezervasyonOpt = rezervasyonlar.stream()
                .filter(r -> r.getId() == id)
                .findFirst();
        
        if (rezervasyonOpt.isPresent()) {
            rezervasyonlar.remove(rezervasyonOpt.get());
            silinenIdler.add(id); // Silinen id'yi kaydet
            System.out.println("Rezervasyon başarıyla silindi.");
            dosyayaKaydet();
        } else {
            System.out.println("Rezervasyon bulunamadı.");
        }
    }

    public void rezervasyonAdSoyadlaSil(String ad, String soyad) {
        for (Rezervasyon rezervasyon : rezervasyonlar) {
            if (rezervasyon.getMusteriAdi().equalsIgnoreCase(ad) && rezervasyon.getMusteriSoyadi().equalsIgnoreCase(soyad)) {
                rezervasyonSil(rezervasyon.getId());
                return;
            }
        }
        System.out.println("Bu ad ve soyadla rezervasyon bulunamadı.");
    }

    private void dosyayaKaydet() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dosyaYolu))) {
            for (Rezervasyon rezervasyon : rezervasyonlar) {
                writer.write(rezervasyon.getId() + "," +
                             rezervasyon.getMusteriAdi() + "," +
                             rezervasyon.getMusteriSoyadi() + "," +
                             rezervasyon.getRezervasyonZamani() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Dosyaya kaydedilirken bir hata oluştu: " + e.getMessage());
        }
    }

    private void dosyadanRezervasyonlariYukle() {
        try (BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir;
            while ((satir = reader.readLine()) != null) {
                String[] veri = satir.split(",");
                int id = Integer.parseInt(veri[0]);
                String ad = veri[1];
                String soyad = veri[2];
                LocalDateTime zaman = LocalDateTime.parse(veri[3]);
                rezervasyonlar.add(new Rezervasyon(id, ad, soyad, zaman));
            }
        } catch (IOException e) {
            System.out.println("Dosya okunurken bir hata oluştu: " + e.getMessage());
        }
    }
}
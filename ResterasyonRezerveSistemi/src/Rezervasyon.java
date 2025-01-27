import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Rezervasyon {
    private int id;
    private String musteriAdi;
    private String musteriSoyadi;
    private LocalDateTime rezervasyonZamani;

    public Rezervasyon(int id, String musteriAdi, String musteriSoyadi, LocalDateTime rezervasyonZamani) {
        this.id = id;
        this.musteriAdi = musteriAdi;
        this.musteriSoyadi = musteriSoyadi;
        this.rezervasyonZamani = rezervasyonZamani;
    }

    public int getId() {
        return id;
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }

    public String getMusteriSoyadi() {
        return musteriSoyadi;
    }

    public LocalDateTime getRezervasyonZamani() {
        return rezervasyonZamani;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return "Rezervasyon No: " + id + "\n" +
               "Müşteri Adı: " + musteriAdi + "\n" +
               "Müşteri Soyadı: " + musteriSoyadi + "\n" +
               "Rezervasyon Zamanı: " + rezervasyonZamani.format(formatter) + "\n" +
               "------------------------";
    }
}

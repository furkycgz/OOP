import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        RezervasyonYonetici yonetici = new RezervasyonYonetici();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        while (true) {
            System.out.println("1. Rezervasyon Ekle");
            System.out.println("2. Rezervasyonları Listele");
            System.out.println("3. Rezervasyon Sil");
            System.out.println("4. Ad Soyadla Rezervasyon Sil");
            System.out.println("5. Çık");
            System.out.print("Bir seçenek girin: ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("Müşteri adı girin: ");
                    String ad = scanner.nextLine();
                    System.out.print("Müşteri soyadı girin: ");
                    String soyad = scanner.nextLine();

                    LocalDateTime zaman = null;
                    while (zaman == null) {
                        try {
                            System.out.print("Rezervasyon tarihi (dd-MM-yyyy formatında): ");
                            String tarih = scanner.nextLine();
                            System.out.print("Rezervasyon saati (HH:mm formatında): ");
                            String saat = scanner.nextLine();
                            zaman = LocalDateTime.parse(tarih + " " + saat, formatter);
                        } catch (Exception e) {
                            System.out.println("Geçersiz tarih veya saat formatı. Lütfen tekrar deneyin.");
                        }
                    }
                    yonetici.rezervasyonEkle(ad, soyad, zaman);
                    break;
                case 2:
                    yonetici.rezervasyonlariListele();
                    break;
                case 3:
                    System.out.print("Silmek istediğiniz rezervasyon numarasını girin: ");
                    int id = scanner.nextInt();
                    yonetici.rezervasyonSil(id);
                    break;
                case 4:
                    System.out.print("Silmek istediğiniz müşteri adını girin: ");
                    String silAd = scanner.nextLine();
                    System.out.print("Silmek istediğiniz müşteri soyadını girin: ");
                    String silSoyad = scanner.nextLine();
                    yonetici.rezervasyonAdSoyadlaSil(silAd, silSoyad);
                    break;
                case 5:
                    System.out.println("Çıkılıyor...");
                    return;
                default:
                    System.out.println("Geçersiz seçenek. Lütfen tekrar deneyin.");
            }
        }
    }
}

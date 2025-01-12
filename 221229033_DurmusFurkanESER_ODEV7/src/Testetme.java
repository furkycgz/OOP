public class Testetme {
    public static void main(String[] args) {
        Beverages icecek = new Beverages("Elma Suyu", 1, 1.0, 10.5, 100);
        Condiments cesni = new Condiments("Karabiber", 2, 0.7, 40.0, 30);
        Confections sekerleme = new Confections("Jelibon", 3, 0.25, 18.0, 90);
        DairyProducts sutUrunu = new DairyProducts("Yoğurt", 4, 0.12, 14.0, 180);
        Cereals tahil = new Cereals("Mercimek", 5, 5.0, 125.0, 40);

        // Beverages Test
       
        icecek.birimAgirlikEkle(10);
        icecek.fiyatGuncelle(12.0);
        icecek.ozellikEkle("sıcak");

        // Condiments Test
        cesni.urunDetaylari();
        cesni.stokAzalt(10);
        cesni.indirimUygula(5);

        // Confections Test
        sekerleme.urunDetaylari();
        sekerleme.stokAzalt(15);
        sekerleme.zamYap(2);

        // DairyProducts Test

        sutUrunu.birimAgirlikEkle(20);
        sutUrunu.kapasiteHesapla(2.0);

        // Cereals Test
    
        tahil.fiyatGuncelle(120.0);
        tahil.stokSil();
    }
}

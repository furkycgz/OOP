package Paket1;

import Paket2.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class dosyaOku   {
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
	
	

}

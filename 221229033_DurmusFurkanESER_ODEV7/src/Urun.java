
public abstract class  Urun implements IUrun  {
 
	    protected String ad;
	    protected int kategoriIndex;
	    protected double birimAgirlik;
	    protected double birimFiyat;
	    protected int stokMiktari;

	    public Urun(String ad, int kategoriIndex, double birimAgirlik, double birimFiyat, int stokMiktari) {
	        this.ad = ad;
	        this.kategoriIndex = kategoriIndex;
	        this.birimAgirlik = birimAgirlik;
	        this.birimFiyat = birimFiyat;
	        this.stokMiktari = stokMiktari;
	    }
	   
	   
	    public abstract void birimAgirlikEkle(int miktar);

	    @Override
	    public void stokAzalt(int miktar) {
	        if (miktar > stokMiktari) {
	            System.out.println("Stok yetersiz! Mevcut stok: " + stokMiktari);
	        } else {
	            stokMiktari -= miktar;
	            System.out.println(ad + " stok miktarı güncellendi: " + stokMiktari);
	        }
	    }  
	    public abstract void fiyatGuncelle(double yeniFiyat);

	    @Override
	    public void urunDetaylari() {
	        System.out.println("Ürün: " + ad);
	        System.out.println("Kategori Index: " + kategoriIndex);
	        System.out.println("Birim Ağırlık: " + birimAgirlik);
	        System.out.println("Birim Fiyat: " + birimFiyat);
	        System.out.println("Stok Miktarı: " + stokMiktari);
	    }
	
	
}

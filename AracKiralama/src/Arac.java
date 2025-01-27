import java.util.List;

public class  Arac {
	    protected int sıra ;
	    protected String plaka;
	    protected String markaModel;
	    protected String YakıtTuru;
	    protected String vitesTuru;
	    protected int ucret;
	    protected String durum;
	    protected int kalanKm;

	 
	    public Arac(int sıra ,String plaka, String markaModel,String YakıtTuru, String vitesTuru, int ucret, String durum, int kalanKm) {
	    	this.sıra=sıra;
	        this.plaka = plaka;
	        this.markaModel = markaModel;
	        this.YakıtTuru= YakıtTuru;
	        this.vitesTuru = vitesTuru;
	        this.ucret = ucret;
	        this.durum = durum;
	        this.kalanKm = kalanKm;
	    }

	    public String toString() {
	        return sıra + ". | "  + plaka + " | " + markaModel + " | " + YakıtTuru  + " | " + vitesTuru + " | " + ucret + " TL | " + durum + " | " + kalanKm + " km";
	    }
	
	    public static void YakıtAlarm(List<Arac> genelListe) {
	        for (Arac arc : genelListe) {
	            if (arc instanceof Dizel && arc.kalanKm < 25) {
	                System.out.println("En yakın istasyonda " + arc.plaka + " plakalı aracınıza motorin dolumu yapınız ....");
	            }
	            if (arc instanceof Benzin && arc.kalanKm < 25) {
	                System.out.println("En yakın istasyonda " + arc.plaka + " plakalı aracınıza benzin dolumu yapınız ....");
	            }
	            if (arc instanceof Elektrik && arc.kalanKm < 25) {
	                System.out.println("En yakın istasyonda " + arc.plaka + " plakalı aracınızı şarj ediniz ....");
	            }
	        }
	    }
	    
	    public static void fiyatHesapla(List<Arac> genelListe ,int gunSayisi) {
	    	 for (Arac arac : genelListe) {
	    		 int toplam = arac.ucret * gunSayisi;
	 	         System.out.println( arac.plaka + "  plakalı araç için  "  +gunSayisi + " gün  toplam ücret : " + toplam );
			}
	    
	         
	    }

		public int getSıra() {
			return sıra;
		}

		public void setSıra(int sıra) {
			this.sıra = sıra;
		}

		public String getPlaka() {
			return plaka;
		}

		public void setPlaka(String plaka) {
			this.plaka = plaka;
		}

		public String getMarkaModel() {
			return markaModel;
		}

		public void setMarkaModel(String markaModel) {
			this.markaModel = markaModel;
		}

		public String getYakıtTuru() {
			return YakıtTuru;
		}

		public void setYakıtTuru(String yakıtTuru) {
			YakıtTuru = yakıtTuru;
		}

		public String getVitesTuru() {
			return vitesTuru;
		}

		public void setVitesTuru(String vitesTuru) {
			this.vitesTuru = vitesTuru;
		}

		public int getUcret() {
			return ucret;
		}

		public void setUcret(int ucret) {
			this.ucret = ucret;
		}

		public String getDurum() {
			return durum;
		}

		public void setDurum(String durum) {
			this.durum = durum;
		}

		public int getKalanKm() {
			return kalanKm;
		}

		public void setKalanKm(int kalanKm) {
			this.kalanKm = kalanKm;
		}

	

	    

	
	
}

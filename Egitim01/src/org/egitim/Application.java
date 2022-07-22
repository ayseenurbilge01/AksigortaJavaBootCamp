package org.egitim;

public class Application {

	public static void main(String[] args) {
		System.out.println("Eğitim 01 Projesi");
		System.err.println("Hata");
		
		AltSinif altSinif = new AltSinif();
		altSinif.setTanim("TANIM 1");
		System.out.println(altSinif.getTanim());
		altSinif.printUstSinifAdres();
		
		//AltSinif altSinif2 = altSinif;
		AltSinif altSinif2 = new AltSinif();
		altSinif2.setTanim("TANIM 2");
		altSinif2.printUstSinifAdres();
		System.out.println("Alt Sınıf 2: " + altSinif2.getTanim());
		System.out.println("Alt Sınıf 1: " + altSinif.getTanim());
		
		//UstSinif ustSinif = new UstSinif();
		//System.out.println(ustSinif.toString());
		
		StaticMethods.printDateTime();
		StaticMethods.printProjectName();
	}

}

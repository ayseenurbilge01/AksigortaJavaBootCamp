package org.egitim.template.application;

import org.egitim.template.domain.DovizHesap;
import org.egitim.template.domain.FonHesap;
import org.egitim.template.domain.MevduatHesap;

public class Template {

	public static void main(String[] args) {
		
		DovizHesap dovizHesap = new DovizHesap();
		System.out.println("Döviz:");
		dovizHesap.bakiyeGoruntule();
		System.out.println(" ");
		
		FonHesap fonHesap = new FonHesap();
		System.out.println("Fon:");
		fonHesap.bakiyeGoruntule();
		System.out.println(" ");
		
		MevduatHesap mevduatHesap = new MevduatHesap();
		System.out.println("Vadeli Mevduat:");
		mevduatHesap.bakiyeGoruntule();

	}

}

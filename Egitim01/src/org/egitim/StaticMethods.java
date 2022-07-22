package org.egitim;

import java.util.Date;

public class StaticMethods {
	
	private static final String projectName = "Eğitim 01"; 
	
	public static void printDateTime() {
		System.out.println(new Date());
	}
	
	public static void printProjectName() {
		System.out.println(projectName);
	}

}

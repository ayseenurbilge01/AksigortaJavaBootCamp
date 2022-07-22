package org.egitim.facade.client;

import org.egitim.facade.library.FileConverter;

public class PersonelRapor {
	
	public void convertPersonelKimlikToPdf() {
		FileConverter fileConverter = new FileConverter();
		fileConverter.convertFile(getKimlicDoc(), "doc");
	}
	
	private byte[] getKimlicDoc() {
		//File System (Database) Read
		return null;
	}

}

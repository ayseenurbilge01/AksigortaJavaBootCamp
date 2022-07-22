package org.egitim.singleton;

public class Blueprint {
	
	public void printBlueprint() {
		//....
		//...
		//PrinterQ printerQ = new PrinterQ();
		// printerQ.....
		
		PrinterQ printerQ = PrinterQ.getPrinterQ();
		printerQ.addQ(null);
		System.out.println(printerQ);
		
		System.out.println(PrinterQ.getPrinterQ());
		System.out.println(PrinterQ.getPrinterQ());
		System.out.println(PrinterQ.getPrinterQ());
	}

}

package view;

public class CapTabel {
	public static void CapTabel () {
	System.out.println("==========================================================");	
	System.out.printf("%20s", "Nume");
	System.out.format("%5s", "|");
	System.out.printf("%10s", "Vandute\n");
	System.out.println("==========================================================");
	}
	public static void CapTabelProcent () {
		System.out.println("==========================================================");	
		System.out.printf("%20s", "Nume");
		System.out.format("%5s", "|");
		System.out.printf("%10s", "Vandute");
		System.out.format("%5s", "|");
		System.out.printf("%14s", "Procent\n");
		System.out.println("==========================================================");
		
		}
}

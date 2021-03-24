package view;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import domeniu.*;
import view.*;

public class Rapoarte {
	public static void afisareListaIntreaga (ArrayList <Revista> listaReviste){
		Iterator itr=listaReviste.iterator();  
		CapTabel.CapTabel();
		while(itr.hasNext()){
		Revista rev=(Revista)itr.next();
		rev.afisare();
		}
	}
	
public static void sortareNume (ArrayList <Revista> listaReviste){
	Collections.sort(listaReviste,new NameComparator());  //folosirea comparatorului dupa nume
	Iterator itr=listaReviste.iterator();  	
	CapTabel.CapTabel();
	while(itr.hasNext()){
	Revista rev=(Revista)itr.next();
	rev.afisare();
	}
}

public static void sortareVanzari (ArrayList <Revista> listaReviste) {
	Collections.sort(listaReviste,new SalesComparator());  //folosirea comparatorului dupa vanzari
	Iterator itr2=listaReviste.iterator();  
	Iterator itr3=listaReviste.iterator(); 
	//System.out.println("NUME%30s"+"VANDUTE%20d");
	int totalVandute=0;
	
	CapTabel.CapTabelProcent();
	while(itr2.hasNext()){  
	Revista rev=(Revista)itr2.next();  
	totalVandute +=rev.getVandute();
	}
	
	
	while (itr3.hasNext()){
		Revista rev=(Revista)itr3.next();  
		double procent = (rev.getVandute()*1.0/totalVandute)*100;
	//rev.afisare();
		System.out.format("%-20s", rev.getNume());
		System.out.format("%5s", "|");
		System.out.format("%10d", rev.getVandute());
		System.out.format("%5s", "|");
		System.out.format("%10.2f%2s", procent,"%");
		System.out.format("\n");
	}
	System.out.println("\n                TOTAL VANDUTE: "+totalVandute);
	
}

}

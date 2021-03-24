package Controller;
import domeniu.*;
import view.*;
import java.io.*;
import java.util.*;

public class Aplicatie {
	public static int citIntreg(String sir){
		try{								//verificare input
			System.out.print(sir);
			Scanner S= new Scanner(System.in);
			int I=S.nextInt();
			return I;			
		}
		catch(Exception E){
			System.out.println("Ai gresit, mai incearca");
			return citIntreg(sir);
		}	
	}
	public static ArrayList<Revista> citireDinFisier() throws IOException{
		BufferedReader reader;
		ArrayList <Revista> listaReviste= new ArrayList<Revista>();
		int totalVandute = 0;
		
		try {					//verificare citire din fisier
		      reader = new BufferedReader(new FileReader ("C:\\Users\\Bebe\\eclipse-workspace\\FPATema4\\src\\RevisteNoi"));
		      String line = reader.readLine();
		      while (line !=null) {
		       
		    	  String[] entry = line.split(",");    
		    	  long vandute=Long.parseLong(entry[1]);					//se citeste linie cu linie, se face split dupa virgula, si se asigneaza valorile revistei
		          Revista revista = new Revista(entry[0],vandute);
		          listaReviste.add(revista);
		          
		          revista.afisare();
		    	  //System.out.println(line);
		    	  line = reader.readLine();
		      }
		    
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return listaReviste;
	}
	
	public static int meniu(){
		System.out.println();
		System.out.println("1.Citire date din fisier");	//citire si parsare
		System.out.println("2.Afisare tot");			//afisare tot in forma tabelara
		System.out.println("3.Afisare Reviste dupa Nume"); 	//afisare tabel dupa nume
		System.out.println("4.Afisare Reviste dupa Vanzari");  //afisare tabel sortat dupa numarul de reviste vandute
		System.out.println("0.Terminare program");
		return(citIntreg("da optiunea ta:"));
	}
	public static void main(String[] args) throws IOException {
		 
		int opt=meniu();
		ArrayList<Revista> listaReviste=null;
		while(opt!=0){
			switch(opt){
			case 1:
					System.out.println("Lista Revistelor:");
					listaReviste=citireDinFisier();
				   break;
			case 2:if(listaReviste!=null)Rapoarte.afisareListaIntreaga(listaReviste); 		//Afiseaza tot tabelul
			       else System.out.println("!!!n-ai citit datele din fisier");
			       break;
			case 3:
					System.out.println("\n\nSortare dupa Nume");  //Afiseaza tot tabelul sortat pe NUme
					Rapoarte.sortareNume(listaReviste);  
			       break;
			case 4:
					System.out.println("\n\nSortare dupa Vanzari");   //Afiseaza tot tabelul sortat pe Vanzari
					Rapoarte.sortareVanzari(listaReviste);
			       break;
			       
			default:
				   System.out.println("Ai gresit optiunea, mai incearca!!!");
			}
			opt=meniu();
		}
		System.out.println("Program terminat");
	}	
		
	
	
	
	
		/*A. TAD Revista. 
	       - date membru:
	   		- nume: string;
	            - vandute: long;
	       - metode: 
	                 -sortare alfabetică;
	                 -sortare descrescatoare după articole.              
	B.  Se citesc informaţiile despre mai multe ziare şi se afişează 2 tabele cu următoarele antete:

	Nume revista	Număr vandute 
	Sortat alfabetic:

	Nume revista	Număr vandute	Procent din total vandute
	Sortat descrescator:
		*/



	}



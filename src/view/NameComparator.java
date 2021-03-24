package view;
import java.util.*;  
import domeniu.*;


public class NameComparator implements Comparator {

	public int compare(Object o1,Object o2){  
	Revista r1=(Revista)o1;  
	Revista r2=(Revista)o2;  
	  
	if(r1.getNume()==r2.getNume())  
	return 0;  
	else return r1.getNume().compareTo(r2.getNume());
	}  
	
}

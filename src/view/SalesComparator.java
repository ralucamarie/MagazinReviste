package view;
import java.util.*;  
import domeniu.*;

	
public class SalesComparator implements Comparator{
	public int compare(Object o1,Object o2){  
		Revista r1=(Revista)o1;  
		Revista r2=(Revista)o2;  
		  
		if(r1.getVandute()==r2.getVandute())  
		return 0;  
		else if (r1.getVandute()<r2.getVandute())
			return 1;
		else 
			return -1;
			
		}  
}




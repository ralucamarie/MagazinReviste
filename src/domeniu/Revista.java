package domeniu;


public class Revista implements Comparable <Revista>{
	private String nume;
	private long vandute; 
	
	Revista(){
		nume = "";
		vandute=0;
	}
	
	public Revista (String nume, long vandute) {	//constructor
		this.nume = nume;
		this.vandute = vandute;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public long getVandute() {
		return vandute;
	}

	public void setVandute(long vandute) {
		this.vandute = vandute;
	}
	
	public void afisare() {						//afisare linii
		System.out.format("%-20s", nume);
		System.out.format("%5s", "|");
		System.out.format("%10d", vandute);
		System.out.format("\n");
	}

	@Override
	public int compareTo(Revista o) {
		return Long.compare(this.getVandute(), o.getVandute());
	}
	

}

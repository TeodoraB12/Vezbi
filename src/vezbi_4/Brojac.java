package vezbi_4;

public class Brojac {
	public int glava = 0;
	public int pismo = 1;
	public int lice;
	public String ime;
	public int num;

	public Brojac() {
		frlanje();
	}
	public void frlanje() {
		lice = (int) (Math.random() * 2);
	}
	public boolean glava() {
		return (lice == glava);
	}
	public String toString() {
		if(lice == glava) 
			ime = "Glava";
		else
			ime = "Pismo";
		return ime;
		
	}

}

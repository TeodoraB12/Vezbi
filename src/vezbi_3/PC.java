package vezbi_3;

public class PC {
	public int memorija;
	public String tipNaMemorija;
	public int SSD;
	public String golemina  = "GB";
	
	public PC() {
		this.memorija = 2;
		this.tipNaMemorija = "DDR4";
		this.SSD = 256;
	}
	
	public void Metod (int zgolemiMemorija, int novSSD) {
		System.out.println("Memorijata beshe" + " " + this.memorija + golemina + "," + "sega iznesuva" + " " + (this.memorija + zgolemiMemorija) + golemina + ".");
		System.out.println("Tipot na memorijata" + " " + this.tipNaMemorija);
		System.out.println("SSD ima golemina od" + " " + this.SSD + " " + golemina + "." + "Prethodno iznesuvase" + " " + (this.SSD + novSSD) + " " + golemina + ".");
	

	}

}

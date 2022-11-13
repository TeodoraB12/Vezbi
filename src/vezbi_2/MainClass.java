package vezbi_2;

public class MainClass {

	public static void main(String[] args) {
		Fakultet fax1 = new Fakultet ();
		fax1.nazivNaFakultet = "FIKT";
		fax1.brojNaSmerovi = 2;
		fax1.brojNaStudenti = 150;
		fax1.dekan = "Aleksandar Markoski";
		fax1.sediste = "Bitola";
		
		System.out.println("Zgolemen broj na studentite za 50: " + fax1.PrvMetod());
		System.out.println("Namalen broj na studenti" + " " + fax1.VtorMetod(150));
		fax1.TretMetod();
		
		Fakultet fax2 = new Fakultet ();
		fax2.nazivNaFakultet = "Pedagoski";
		fax2.brojNaSmerovi = 5;
		fax2.brojNaStudenti = 200;
		fax2.dekan = "Liljana Petrova";
		fax2.sediste = "Bitola";
		
		System.out.println("Zgolemen broj na studentite za 50: " + fax2.PrvMetod());
		System.out.println("Namalen broj na studenti" + " " + fax2.VtorMetod(200));
		fax2.TretMetod();
	}

}

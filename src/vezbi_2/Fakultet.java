package vezbi_2;

public class Fakultet {
		public String nazivNaFakultet;
		public int brojNaSmerovi;
		public int brojNaStudenti;
		public String dekan;
		public String sediste;

  public int PrvMetod () {
	  int novBroj;
	  novBroj = this.brojNaStudenti + 50;
	  return novBroj;
  }
  
  public int VtorMetod (int namali) {
	  int namalenaVrednost = this.brojNaStudenti - namali;
	  return namalenaVrednost;
	  
  }
  public void TretMetod () {
	  System.out.println(this.nazivNaFakultet + "," + this.sediste);
  }
}

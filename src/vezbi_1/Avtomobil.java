package vezbi_1;

public class Avtomobil {
	public String marka;
	public String model;
	public String boja;
	public double pominatiKm;
	public int godinaNaProizvodstvo;
	public String registracija;
	
	

	public Avtomobil(String marka, String model, String boja, double pominatiKm, int godinaNaProizvodstvo, String registracija) {
		this.marka = marka;
		this.model = model;
		this.boja = boja;
		this.pominatiKm = pominatiKm;
		this.godinaNaProizvodstvo = godinaNaProizvodstvo;
		this.registracija = registracija;
	}
	
	public void PrvMetod () {
		System.out.println(this.marka + "," + this.model + "," + this.boja);
	}
	
	public double VtorMetod () {
			double vrednost;
			vrednost = this.pominatiKm + 152025;
			return vrednost;
	}

}

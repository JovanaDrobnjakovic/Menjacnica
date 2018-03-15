package interfejsMenjacnica;

public interface InterfejsMenjacnica {
	public void dodajKurs(double prodajniKurs, double srednjiKurs, double kupovniKurs, String nazivValute);

	public void obrisiKurs(String nazivValute);

	public double vratiKurs(String nazivValute);
}

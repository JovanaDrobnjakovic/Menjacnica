package implementacijaInterfejsa;

import java.util.LinkedList;

import Valuta.Valuta;
import interfejsMenjacnica.InterfejsMenjacnica;

public class ImpelementacijaInterfejsa implements InterfejsMenjacnica {
	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	public void dodajKurs(double prodajniKurs, double srednjiKurs, double kupovniKurs, String nazivValute) {
		if (nazivValute != null) {
			for (int i = 0; i < valute.size(); i++) {
				if (valute.get(i).getNazivValute().equals(nazivValute)) {
					valute.get(i).setKupovniKurs(kupovniKurs);
					valute.get(i).setProdajniKurs(prodajniKurs);
					valute.get(i).setSrednjiKurs(srednjiKurs);
				}
			}
		}

	}

	@Override
	public void obrisiKurs(String nazivValute) {
		// TODO Auto-generated method stub

	}

	@Override
	public double vratiKurs(String nazivValute) {
		// TODO Auto-generated method stub
		return 0;
	}

}

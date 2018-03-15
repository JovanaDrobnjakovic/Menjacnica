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

	public void obrisiKurs(String nazivValute) {

		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNazivValute().equals(nazivValute)) {
				valute.get(i).setKupovniKurs(0);
				valute.get(i).setProdajniKurs(0);
				valute.get(i).setSrednjiKurs(0);
			}
		}

	}

	public double vratiKurs(String nazivValute) {
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNazivValute().equals(nazivValute))
				return valute.get(i).getSrednjiKurs();
		}
		return 0;
	}

}

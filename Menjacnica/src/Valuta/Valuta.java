package Valuta;

public class Valuta {
	private String nazivValute;
	private String skraceniNazivValute;
	private double prodajniKurs;
	private double srednjiKurs;
	private double kupovniKurs;

	public String getNazivValute() {
		return nazivValute;
	}

	public void setNazivValute(String nazivValute) {
		if (nazivValute == null) {
			throw new RuntimeException("Uneli ste prazan string");
			}
		this.nazivValute = nazivValute;
	}

	public String getSkraceniNazivValute() {
		return skraceniNazivValute;
	}

	public void setSkraceniNazivValute(String skraceniNazivValute) {
		if (skraceniNazivValute == null) {
			throw new RuntimeException("Uneli ste prazan string");
			}
		this.skraceniNazivValute = skraceniNazivValute;
	}

	public double getProdajniKurs() {
		return prodajniKurs;
	}

	public void setProdajniKurs(double prodajniKurs) {
		if (prodajniKurs < 0) {
			throw new RuntimeException("Greska");
			}
		this.prodajniKurs = prodajniKurs;
	}

	public double getSrednjiKurs() {
		return srednjiKurs;
	}

	public void setSrednjiKurs(double srednjiKurs) {
		if (srednjiKurs < 0) {
			throw new RuntimeException("Greska");
			}
		this.srednjiKurs = srednjiKurs;
	}

	public double getKupovniKurs() {
		return kupovniKurs;
	}

	public void setKupovniKurs(double kupovniKurs) {
		if (kupovniKurs < 0) {
			throw new RuntimeException("Greska");
			}
		this.kupovniKurs = kupovniKurs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nazivValute == null) ? 0 : nazivValute.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skraceniNazivValute == null) ? 0 : skraceniNazivValute.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (nazivValute == null) {
			if (other.nazivValute != null)
				return false;
		} else if (!nazivValute.equals(other.nazivValute))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (skraceniNazivValute == null) {
			if (other.skraceniNazivValute != null)
				return false;
		} else if (!skraceniNazivValute.equals(other.skraceniNazivValute))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Valuta [nazivValute=" + nazivValute + ", skraceniNazivValute=" + skraceniNazivValute + ", prodajniKurs="
				+ prodajniKurs + ", srednjiKurs=" + srednjiKurs + ", kupovniKurs=" + kupovniKurs + "]";
	}

}

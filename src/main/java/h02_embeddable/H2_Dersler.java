package h02_embeddable;

public class H2_Dersler {

	private String secmeli;
	
	private String zorunlu;

	public H2_Dersler() {
		
	}

	public H2_Dersler(String secmeli, String zorunlu) {
		
		this.secmeli = secmeli;
		this.zorunlu = zorunlu;
	}

	public String getsecmeli() {
		return secmeli;
	}

	public void setsecmeli(String secmeli) {
		this.secmeli = secmeli;
	}

	public String getZorunlu() {
		return zorunlu;
	}

	public void setZorunlu(String zorunlu) {
		this.zorunlu = zorunlu;
	}

	@Override
	public String toString() {
		return "Dersler [secmeli=" + secmeli + ", zorunlu=" + zorunlu + "]";
	}
	
	
	
	
	
	
}

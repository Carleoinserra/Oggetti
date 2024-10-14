
public class Appartamento {
	
	private String NomeProprietario;
	private int superfiecie;
	private int nPiani;
	private int nInquilini;
	public Appartamento(String nomeProprietario, int superfiecie, int nPiani, int nInquilini) {
		
		this.NomeProprietario = nomeProprietario;
		this.superfiecie = superfiecie;
		this.nPiani = nPiani;
		this.nInquilini = nInquilini;
	}
	public String getNomeProprietario() {
		return NomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		NomeProprietario = nomeProprietario;
	}
	public int getSuperfiecie() {
		return superfiecie;
	}
	
	public int getnPiani() {
		return nPiani;
	}
	
	@Override
	public String toString() {
		return "Appartamento [NomeProprietario=" + NomeProprietario + ", superfiecie=" + superfiecie + ", nPiani="
				+ nPiani + ", nInquilini=" + nInquilini + "]";
	}
	public int getnInquilini() {
		return nInquilini;
	}
	public void setnInquilini(int nInquilini) {
		this.nInquilini = nInquilini;
	}
	
	
	

}

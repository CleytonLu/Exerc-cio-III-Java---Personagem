
public class Arma extends Artefato{

	public String nomeArma;
	public int poderArma;
	
	//Método Construtor
	public Arma(String nomeArma) {
		super();
		this.nomeArma = nomeArma;
		this.poderArma = (int)(Math.random()*50)+1;;
	}
	
	
	//Métodos Acessores
	public String getNomeArma() {
		return nomeArma;
	}
	public void setNomeArma(String nomeArma) {
		this.nomeArma = nomeArma;
	}
	public int getPoderArma() {
		return poderArma;
	}
	public void setPoderArma(int poderArma) {
		this.poderArma = poderArma;
	}
	
		
	
	
}

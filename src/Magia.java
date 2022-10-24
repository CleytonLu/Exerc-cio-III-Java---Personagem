
public class Magia extends Artefato{

	public String nomeMagia;
	public int poderMagia;
	
	//Método Construtor	
	public Magia(String nomeMagia) {
		super();
		this.nomeMagia = nomeMagia;
		this.poderMagia = (int)(Math.random()*50)+1;
	}
	
	//Métodos Acessores
	public String getNomeMagia() {
		return nomeMagia;
	}
	
	public void setNomeMagia(String nomeMagia) {
		this.nomeMagia = nomeMagia;
	}
	public int getPoderMagia() {
		return poderMagia;
	}
	public void setPoderMagia(int poderMagia) {
		this.poderMagia = poderMagia;
	}
	
	
	
}

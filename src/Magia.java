
public class Magia extends Artefato{

	public String nomeMagia;
	public int poderMagia;
	
	//M�todo Construtor	
	public Magia(String nomeMagia) {
		super();
		this.nomeMagia = nomeMagia;
		this.poderMagia = (int)(Math.random()*50)+1;
	}
	
	//M�todos Acessores
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

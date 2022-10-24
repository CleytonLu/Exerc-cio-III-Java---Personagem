import java.util.Random;

public class Personagem {
	
	private String nome;
	private int forca;
	private String raca;
	private int vida;
	private int nivel;
	
	private Magia magia;
	private Arma arma;
	
	/* Construtor */
	public Personagem(String nome) {
		this.nome = nome;
		this.nivel = (int)(Math.random()*20)+1;
		this.vida = 100;
		this.forca = (int)(Math.random()*100)+1;
	}
	
	
	//Métodos Construtor
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public Magia getMagia() {
		return magia;
	}
	public void setMagia(Magia magia) {
		this.magia = magia;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	
	//Métodos
	
	public void apresentacaoMagia(String nome, int nivel, Magia magia){
		System.out.println("======= APRESENTANDO O PERSONAGEM =======");
		System.out.println("Nome: " + nome + ", nivel: "+nivel+", com a força inicial de: " +forca+ ", e o seu poder é: "+ magia.nomeMagia + ", e a  de: " +  magia.poderMagia + " e o artefato é: "+ magia.getNomeArtefato());
		System.out.println("=========================================");
	}
	
	public void apresentacaoArma(String nome, int nivel, Arma arma){
		System.out.println("======= APRESENTANDO O PERSONAGEM =======");
		System.out.println("Nome: " + nome + ", nivel: "+nivel+", com a força inicial de: " +forca+ ", e o seu poder é: "+ arma.nomeArma + ", e a Arma de: " +  arma.poderArma + " e o artefato é: "+ arma.getNomeArtefato() );
		System.out.println("=========================================");
	}
	
	public void levelUp(int nivel){
		this.nivel += getNivel();
		setNivel(nivel);
		System.out.println("O " + nome + " Recebeu um aumento de + " + getNivel() + " no seu level, agora está com: "+nivel);
	}
	
	public void lutar(Personagem p1, Personagem p2){
		System.out.println("");
		System.out.println("======== É HORA DO PAU =========");
		if(p1.forca >= p2.forca){
			p2.vida -= p1.forca ;
			System.out.println(p2.nome+" sofreu um dano de " + p1.forca + " e está com "+p2.vida+" de vida.");
			System.out.println(p2.nome + " perdeu a luta!");
		System.out.println(p1.nome+ " Recebeu um Up de: "+ getNivel());
			System.out.println("");
		}else if(p1.forca <= p2.forca){
			System.out.println("");
			p1.vida -= p2.forca ;
			System.out.println(p1.nome+" sofreu um dano de " + p2.forca + " e está com "+p1.vida+" de vida.");
			System.out.println(p1.nome + " perdeu a luta!");
			System.out.println(p1.nome+ " Recebeu um Up de: "+ getNivel());
			System.out.println("");
		}
		
		System.out.println("*A força do "+p1.nome+" foi de: "+p1.forca+"*");
		System.out.println("*A força do "+p2.nome+" foi de: "+p2.forca+"*");
	}
	
	
	
	
	
	
}

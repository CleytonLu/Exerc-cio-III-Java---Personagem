
public class Principal {

	public static void main(String[] args) {
		
		//Personagem 1 Zach(mágia)
		Personagem Zatch = new Personagem("Zatch");
		Magia magia = new Magia("Bao");
		magia.setNomeArtefato(null);
		
		Zatch.apresentacaoMagia("Zatch", 1, magia);
		//Zatch.levelUp(1);
		
		
		//Personagem 2 Arthut(Arma)
		Personagem Arthur = new Personagem("Ahtur");
		Arma arma = new Arma("Espada");
		arma.setNomeArtefato("Excalibur");
		
		Arthur.apresentacaoArma("Arthur", 1, arma);
		
		
		//Personagem 3 Escanor(Arma)
		Personagem Escanor = new Personagem("Escnor");
		Arma machado = new Arma("machado");
		machado.setNomeArtefato("Alylika-Chan");
		
		Escanor.apresentacaoArma("Escanor", 1, machado);
		
		
		Personagem drEstranho = new Personagem("Doutor Estranho");
		Magia mago = new Magia("Mãos de Dragão");
		mago.setNomeArtefato("Olho de Agamoto");
		
		drEstranho.apresentacaoMagia("Doutor Estranho", 1, mago);
		
		drEstranho.lutar(drEstranho, Arthur);
		Zatch.lutar(Zatch, Escanor);

	}

}

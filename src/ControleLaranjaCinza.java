
public class ControleLaranjaCinza extends Main {

	private String cor2 = "cinza";
	private String cor = "laranja";

	

	public String getCor2() {
		return cor2;
	}



	public void setCor2(String cor2) {
		this.cor2 = cor2;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	// metodo Generico por referencia
	public void validaCor(Main item) {
		System.out.println("Acionando método da classe Controle laranjaCinza");
		item.classeMain(cor);

	}

}

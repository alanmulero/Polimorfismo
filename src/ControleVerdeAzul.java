
public class ControleVerdeAzul extends PrimeiraHierarquia {
	
	private String verde = "verde";
	private String azul = "azul";
	public String getVerde() {
		return verde;
	}
	public void setVerde(String verde) {
		this.verde = verde;
	}
	public String getAzul() {
		return azul;
	}
	public void setAzul(String azul) {
		this.azul = azul;
	}
	
	// metodo Generico por referencia
		public void validaCor(PrimeiraHierarquia item) {
			System.out.println("Acionando método da classe Controle VerdeAzul");
			item.classePrimeira(verde);
			//item.classeMain(azul);


		}

}

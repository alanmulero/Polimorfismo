
public  class PrimeiraHierarquia extends Main {
	
	// Controle de privilégios
	// Classe para cores Azul e Verde
	
	private String azul = "azul";
	private String verde = "verde";
	public String getAzul() {
		return azul;
	}
	public void setAzul(String azul) {
		this.azul = azul;
	}
	public String getVerde() {
		return verde;
	}
	public void setVerde(String verde) {
		this.verde = verde;
	}
	 // Metodo cor
	public boolean classePrimeira(String item) {
		if (this.azul == item || this.verde == item ) {
			System.out.println("Cor validada com sucesso: "+ item);
			return true;
			
		}else {
			System.out.println("Esta cor não pertence a classe PrimeiraHierarquia: "+item);
			return false;
		}
		
	}

}


public  class Main {
	
	// Classe mãe
	private String laranja = "laranja";
	private String cinza = "cinza";
	
	
	//Função por referencia generica.
	public String getLaranja() {
		return laranja;
	}


	public void setLaranja(String laranja) {
		this.laranja = laranja;
	}


	public String getCinza() {
		return cinza;
	}


	public void setCinza(String cinza) {
		this.cinza = cinza;
	}


	public void classeMain(String item) {
		if (this.laranja == item || this.cinza == item ) {
			System.out.println("Cor validada com sucesso: "+ item);
			
			
		}else {
			System.out.println("Esta cor não pertence a classe Main: "+item);
			
		}
		
	}

}

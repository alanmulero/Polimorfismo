
public class Retorno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciando classes.
		
		// Laranja & Ciza classe Main
		Laranja laranja = new Laranja();
		ControleLaranjaCinza  laranja1 =  new ControleLaranjaCinza();
		laranja1.validaCor(laranja1);
		laranja1.validaCor(laranja);
		laranja.classeMain("laranja");
		laranja1.classeMain("cinza");
		laranja.classeMain("verde");
		System.out.println("***********************");
		
		// Verde & Azul classe primeiraHierarquia.
		
		Azul azul = new Azul();
		Verde verde = new Verde();
		ControleVerdeAzul controleVerdeAzul = new ControleVerdeAzul();
		azul.classePrimeira("azul");
		controleVerdeAzul.validaCor(verde);
		controleVerdeAzul.validaCor(azul);
		verde.classePrimeira("branco");
				
		

	}

}

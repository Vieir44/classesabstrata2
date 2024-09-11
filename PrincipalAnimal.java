package classeabstrata;

public class PrincipalAnimal {

	public static void main(String[] args) {
		
		
		Lobo neve = new Lobo("Dormir", "Uivando", "Andando", "Correndo");
		neve.dormir();
		neve.som();
		neve.anda();
		neve.correr();
		
		System.out.println("---------------------------");
		
		Leao africano = new Leao ("Dormir","Rugindo","Andando", "Correndo");
		africano.dormir();
		africano.som();
		africano.anda();
		africano.correr();
		
		System.out.println("---------------------------");
		
		Tigre sulchina = new Tigre ("Dormir","Roncando", "Andando","Correndo");
		sulchina.dormir();
		sulchina.som();
		sulchina.anda();
		sulchina.correr();
		
		System.out.println("---------------------------");
		
		Cachorro pastoralemao = new Cachorro("Dormir","Latindo", "Andando", "Correndo");
		pastoralemao.dormir();
		pastoralemao.som();
		pastoralemao.anda();
		pastoralemao.correr();
		
		System.out.println("------------------------------");
		
		Gato slames = new Gato("Dormir","Miando", "Andando", "Correndo");
		slames.dormir();
		slames.som();
		slames.anda();
		slames.correr();


	}

}

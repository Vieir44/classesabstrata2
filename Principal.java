package classeabstrata;

public class Principal  {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro("00000","F1", "Vermelho",2023);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		
		System.out.println("---------------------------");
		
		Onibus marcopolo = new Onibus ("11111","XB1","Prata",2020);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.virar();
		marcopolo.frear();
		
		System.out.println("---------------------------");
		
		Moto yamaha = new Moto ("222222","FLUO ABS", "Bronze",2010);
		yamaha.ligar();
		yamaha.acelerar();
		yamaha.virar();
		yamaha.frear();
		
		System.out.println("---------------------------");
		
		Carro uno = new Carro("333333","FIAT Mille", "Prata", 2010);
		uno.ligar();
		uno.acelerar();
		uno.virar();
		uno.frear();

	}

}

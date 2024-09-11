package classeabstrata;

public class Cachorro extends Animais {


	
	public Cachorro(String dormir, String som, String anda, String correr) {
		super (dormir, som, anda, correr);
	}
	@Override
	public void dormir() {
		System.out.println("O Cachorro está dormindo ");
	}
	@Override
	public void anda() {
		System.out.println("O cachorro está andando");
	}
	@Override
	public void correr() {
		System.out.println("O cachorro está correndo");
	}
	@Override
	public void som() {
		System.out.println("O cachorro está latindo");

	}

}

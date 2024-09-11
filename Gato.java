package classeabstrata;

public class Gato extends Animais {

	public Gato(String dormir, String som, String anda, String correr) {
		super (dormir, som, anda, correr);
	}
	@Override
	public void dormir() {
		System.out.println("O Gato está dormindo ");
	}
	@Override
	public void anda() {
		System.out.println("O Gato está andando");
	}
	@Override
	public void correr() {
		System.out.println("O Gato está correndo");
	}
	@Override
	public void som() {
		System.out.println("O Gato está miando");

	}

}

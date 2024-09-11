package classeabstrata;

public class Leao extends Animais {

	public Leao(String dormir, String som, String anda, String correr) {
		super (dormir, som, anda, correr);
	}
	@Override
	public void dormir() {
		System.out.println("O Leão está dormindo ");
	}
	@Override
	public void anda() {
		System.out.println("O Leão está andando");
	}
	@Override
	public void correr() {
		System.out.println("O Leão está correndo");
	}
	@Override
	public void som() {
		System.out.println("O Leão está rugindo");

	}

}

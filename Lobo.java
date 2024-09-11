package classeabstrata;

public class Lobo extends Animais {
	
	public Lobo(String dormir, String som, String anda, String correr) {
		super (dormir, som, anda, correr);
	}
	@Override
	public void dormir() {
		System.out.println("O lobo está dormindo ");
	}
	@Override
	public void anda() {
		System.out.println("O lobo está andando");
	}
	@Override
	public void correr() {
		System.out.println("O lobo está correndo");
	}
	@Override
	public void som() {
		System.out.println("O lobo está uivando");
	}
	
	

	

	}



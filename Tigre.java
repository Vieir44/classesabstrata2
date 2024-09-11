package classeabstrata;

public class Tigre extends Animais {

	
	public Tigre(String dormir, String som, String anda, String correr) {
		super (dormir, som, anda, correr);
	}
	@Override
	public void dormir() {
		System.out.println("O TIgre está dormindo ");
	}
	@Override
	public void anda() {
		System.out.println("O Tigre está andando");
	}
	@Override
	public void correr() {
		System.out.println("O Tigre está correndo");
	}
	@Override
	public void som() {
		System.out.println("O Tigre está roncando");
	

	}

}

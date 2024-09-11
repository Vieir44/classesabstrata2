package classeabstrata;

public abstract class Animais {
	
	private String dormir;
	private String som;
	private String anda;
	private String correr;
	
	public Animais(String dormir, String som, String anda, String correr ) {
		this.dormir = dormir;
		this.som = som;
		this.anda = anda;
		this.correr = correr;
	}
	
	//Gerar getters e setters
	
    public abstract void dormir();
    
    public abstract void som();
    
    public abstract void anda();
    
    public abstract void correr();
    
}
    
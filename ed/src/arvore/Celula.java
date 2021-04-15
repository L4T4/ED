package arvore;


public class Celula {
	
	private int elemento;
	private Celula esquerda;
	private Celula direita;
	
	public Celula(int elemento){
		this.elemento=elemento;
	}

	public int getElemento() {
		return elemento;
	}
	public void setElemento(int valor) {
		this.elemento = valor;
	}

	public Celula getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Celula esquerda) {
		this.esquerda = esquerda;
	}

	public Celula getDireita() {
		return direita;
	}

	public void setDireita(Celula direita) {
		this.direita = direita;
	}

	
}

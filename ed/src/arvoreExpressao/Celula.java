package arvoreExpressao;

public class Celula {
	private int valor;	
	private Celula esquerda,direita;
	
	public Celula(int valor){
		this.valor=valor;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
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

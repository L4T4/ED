package arvoreExpressao;

public class TesteArvoreExpressao {

	public static void main(String[] args) {
		ArvoreExpressao arvore = new ArvoreExpressao();
		arvore.montarArvore("((a+8)*b)");	
		arvore.setVariavel('a', 4);
		arvore.setVariavel('b', 2);
		System.out.println(arvore.calcular());

	}

}

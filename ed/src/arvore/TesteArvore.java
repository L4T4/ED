package arvore;

import exercicios.ArvoreInversa;

public class TesteArvore {

	public static void main(String[] args) {
		Arvore arvore = new Arvore();
		int a=3,b=2,c=5,d=6,e=11,f=7,g=10,h=15,i=9;
		arvore.insere(arvore.raiz,f);
		arvore.insere(arvore.raiz,c);
		arvore.insere(arvore.raiz,e);
		arvore.insere(arvore.raiz,d);
		arvore.insere(arvore.raiz,a);
		arvore.insere(arvore.raiz,b);
		arvore.insere(arvore.raiz,h);
		arvore.insere(arvore.raiz,i);
		arvore.insere(arvore.raiz,g);
		System.out.println(arvore.raiz.getElemento());
		ArvoreInversa arvoreInversa= new ArvoreInversa();
		Celula celula = new Celula(10);
		System.out.println(arvoreInversa.calcularComprimento(arvore, celula));
		System.out.println(arvore.raiz.getElemento());
		arvoreInversa.inverte(arvore, arvore.raiz);
		
	}

}

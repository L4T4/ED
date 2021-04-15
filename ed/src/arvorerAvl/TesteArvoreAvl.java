package arvorerAvl;

import arvore.Arvore;
import arvore.Celula;
import exercicios.ArvoreInversa;

public class TesteArvoreAvl {

	public static void main(String[] args) {
		ArvoreAvl arvore = new ArvoreAvl();
		int a=3,b=2,c=5,d=6,e=11,f=7,g=10,h=15,i=9,j=30,k=13,l=16;
		arvore.insere(arvore.raiz,c);
		arvore.insere(arvore.raiz,a);
		arvore.insere(arvore.raiz,b);
		ArvoreInversa inversa = new ArvoreInversa();
		inversa.inverte(arvore, arvore.raiz);
		System.out.println("\n\n\n\n\n");
		inversa.inverte(arvore, arvore.raiz);
		
		
		
	}

}

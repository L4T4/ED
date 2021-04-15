package arvoreAvl2;

public class AvlTree {
	// -------------------------------------------- maxAVL

	private static int maxAVL(int a, int b) {

	if (a > b) {

	return(a);

	}

	else {

	return(b);

	}}

	// -------------------------------------------- alturaAVL

	private static int alturaAVL(AvlNode t) {

	if (t == null) {

	return(-1);

	}

	else {

	return(t.altura);

	}

	}

	// -------------------------------------------- rotacaoEsquerdaAVL

	private static AvlNode rotacaoEsquerdaAVL( AvlNode nodoOut) {

	AvlNode nodoIn = nodoOut.esq;

	int a, b;

	nodoOut.esq = nodoIn.dir;

	nodoIn.dir = nodoOut;

	a = AvlTree.alturaAVL(nodoOut.esq);

	b = AvlTree.alturaAVL(nodoOut.dir);

	nodoOut.altura = AvlTree.maxAVL(a, b) + 1;

	a = AvlTree.alturaAVL(nodoIn.esq);

	b = nodoOut.altura;

	nodoIn.altura = AvlTree.maxAVL(a, b) + 1;

	return(nodoIn);

	}

	// -------------------------------------------- rotacalDireitaAVL

	private static AvlNode rotacaoDireitaAVL( AvlNode nodoOut) {

	AvlNode nodoIn = nodoOut.dir;

	int a, b;

	nodoOut.dir = nodoIn.esq;

	nodoIn.esq = nodoOut;

	a = AvlTree.alturaAVL(nodoOut.esq);

	b = AvlTree.alturaAVL(nodoOut.dir);

	nodoOut.altura = AvlTree.maxAVL(a, b) + 1;

	a = AvlTree.alturaAVL(nodoIn.dir);

	b = nodoOut.altura;

	nodoIn.altura = AvlTree.maxAVL(a, b) + 1;

	return(nodoIn);

	}

	// -------------------------------------------- rotacaoDuplaEsquerdaAVL

	private static AvlNode rotacaoDuplaEsquerdaAVL(AvlNode nodo) {

	nodo.esq = AvlTree.rotacaoDireitaAVL(nodo.esq);

	return(AvlTree.rotacaoEsquerdaAVL(nodo));

	}

	// -------------------------------------------- rotacaoDuplaDireitaAVL

	private static AvlNode rotacaoDuplaDireitaAVL(AvlNode nodo) {

	nodo.dir = AvlTree.rotacaoEsquerdaAVL(nodo.dir);

	return(AvlTree.rotacaoDireitaAVL(nodo));

	}

	private AvlNode raiz;

	// -------------------------------------------- Constriutor

	public AvlTree() {

	this.raiz = null;

	}
	// -------------------------------------------- inserteAVL

	public void insertAVL(int info) {

	this.raiz = insertAVL(info, this.raiz);

	}

	// -------------------------------------------- inserteAVL (sobreCarga)

	private AvlNode insertAVL( int x, AvlNode avl) {

	int a, b;

	if (avl == null) {

		avl = new AvlNode(null, x, null);

	}

	else {

		if (x > avl.info) {
	
			avl.dir = insertAVL(x, avl.dir);
		
			a = AvlTree.alturaAVL(avl.dir);
		
			b = AvlTree.alturaAVL(avl.esq);
	
			if (a - b == 2) {
		
				if (x > avl.dir.info) {
		
					avl = AvlTree.rotacaoDireitaAVL(avl);
		
				}
		
				else {
			
				avl = AvlTree.rotacaoDuplaDireitaAVL(avl);
			
				}
	
			}

		}

		else {

		if (x < avl.info) {
	
			avl.esq = insertAVL(x, avl.esq);
		
			a = AvlTree.alturaAVL(avl.esq);
		
			b = AvlTree.alturaAVL(avl.dir);
		
			if (a - b == 2) {
		
					if (x < avl.esq.info) {
				
					avl = AvlTree.rotacaoEsquerdaAVL(avl);
				
					}
				
					else {
				
					avl = AvlTree.rotacaoDuplaEsquerdaAVL(avl);
				
						}
		
				}
	
			}
	
		}

	}

	a = AvlTree.alturaAVL(avl.esq);

	b = AvlTree.alturaAVL(avl.dir);

	avl.altura = AvlTree.maxAVL(a, b) + 1;

	return(avl);

	}

	// -------------------------------------------- vaziaAVL

	public boolean vaziaAVL() {

		return this.raiz == null;

	}

	// -------------------------------------------- exibeAVL

	public void exibeAVL() {

	if (vaziaAVL()) {

		System.out.println("Status: AVL Vazia");

	} else {

		exibeAVL(this.raiz, 1);

	}

	}

	// -------------------------------------------- exibeAVL (SobreCarga)
	
	private void exibeAVL(AvlNode avl, int t) {

		if (avl != null) {

			exibeAVL(avl.dir, t + 1);
	
			for (int i = 0;i < t;i++) {
	
				System.out.printf(" ");

			}

			System.out.printf("%d \n",avl.info);
	
			exibeAVL(avl.esq, t + 1);

		}

	}



}

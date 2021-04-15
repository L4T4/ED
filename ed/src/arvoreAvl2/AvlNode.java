package arvoreAvl2;

public class AvlNode {
	AvlNode esq;

	int info;

	AvlNode dir;

	int altura;

	// ----------------------------------------- Construtor

	AvlNode(int info) {

	this(null, info, null);

	}

	// ----------------------------------------- Construtor

	AvlNode(AvlNode esquerda, int info, AvlNode direita) {

	this.esq = esquerda;

	this.info = info;

	this.dir = direita;

	this.altura = 0;

	}
}

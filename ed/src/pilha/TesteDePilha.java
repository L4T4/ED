package pilha;

public class TesteDePilha {

	public static void main(String[] args) {

		Pilha pilha = new Pilha();
		pilha.push("joao");
		System.out.println(pilha);
		pilha.push("lucas");
		System.out.println(pilha);
		pilha.push("pedro");
		System.out.println(pilha);
		pilha.push("marcelo");
		System.out.println(pilha);
		Object x=pilha.top();
		System.out.println(pilha);
		Object y = pilha.pop();
		System.out.println(x);
		System.out.println(y);
		System.out.println(pilha);
		System.out.println(pilha.isEmpty());
		System.out.println(pilha.size());
	}

}

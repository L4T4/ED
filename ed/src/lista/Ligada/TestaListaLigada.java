package lista.Ligada;

public class TestaListaLigada {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("Joao");
		System.out.println(lista);
		lista.adicionaNoComeco("Pedro");
		System.out.println(lista);
		lista.adicionaNoComeco("Lucas");
		System.out.println(lista);
		lista.adiciona("gabriel");
		System.out.println(lista);
		lista.adiciona(2,"marcelo");
		System.out.println(lista);
		Object x = lista.pega(2);
		System.out.println(x);
		System.out.println(lista.tamanho());
		lista.removeDoComeco();
		System.out.println(lista);
	}

}

package lista.Dupla.Ligada;


public class TesteListaDuplaLigada {
	
	public static void main(String[] args) {
		ListaDuplaLigada lista = new ListaDuplaLigada();
		
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
		lista.removeDoFim();
		System.out.println(lista);
		lista.remove(1);
		System.out.println(lista);
		System.out.println(lista.contem("gabriel"));
		System.out.println(lista.contem("Joao"));
		
	}
	
}

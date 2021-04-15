package fila;


public class TesteDeFila {

	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.enqueue("joao");
		System.out.println(fila);
		fila.enqueue("lucas");
		System.out.println(fila);
		fila.enqueue("pedro");
		System.out.println(fila);
		fila.enqueue("marcelo");
		System.out.println(fila);
		Object x=fila.peek();
		System.out.println(fila);
		Object y = fila.dequeue();
		System.out.println(x);
		System.out.println(y);
		System.out.println(fila);
		System.out.println(fila.isEmpty());
		System.out.println(fila.size());

	}

}

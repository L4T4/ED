package ordenacao;

import busca.BuscaBinaria;

public class TesteOrdenacao {

	public static void main(String[] args) {
		double[] array ={2.1,2,3.5,1,7,4,10,6,9,3};
		int y=-2;
		
		QuickSort.quicksort(array, 0, array.length);
		for(int x=0; x< array.length;x++)
		{
			System.out.println(array[x]);
		}
		y=BuscaBinaria.busca(array, 0, array.length, 8);
		System.out.println(y);
		
	}

}

package ordenacao;

public class QuickSort {

	public QuickSort() {
		
	}
	
	public static void quicksort(double[] a, int left, int right) {
		if((right-left)>1) // se a quantidade de elementos for maior que 1
		{	// particiona
			int pivo = particiona(a, left, right);
			// ordena 1a metade
			quicksort(a, left, pivo);
			// ordena 2a metade
			quicksort(a, pivo+1, right);
		} // end else
	}
	
	private static int particiona(double[] a, int left, int right) {
		int menoresEncontrados=0;
		
		double pivo = a[right-1];
		for(int atual=0;atual<right-1;atual++)	//o pivo ja esta no ultimo nao precisa passar por ele
		{    if(a[atual] <= pivo) {
				swap(a,atual,menoresEncontrados);
		        menoresEncontrados++;
		    }
		}
		swap(a, menoresEncontrados, (right-1));
		return menoresEncontrados;
	}
	
	private static void swap(double[] vetor,int primeiro , int segundo ){
		double primeiroIntermediario = vetor[primeiro];
	    double segundoIntermediario = vetor[segundo];
	    vetor[primeiro] = segundoIntermediario;
	    vetor[segundo] = primeiroIntermediario;
	}

}

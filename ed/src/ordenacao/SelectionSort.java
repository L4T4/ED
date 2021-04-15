package ordenacao;

public class SelectionSort {

	public SelectionSort() {
		
	}
	
	public static void selectionSort(double[] a, int quantidadeDeElementos) {
	    for(int atual = 0; atual < quantidadeDeElementos; atual++) {
	        int menor = buscaMenor(a, atual, quantidadeDeElementos);
	        swap(a, atual, menor);
	    }
	}
	
	private static void swap(double[] vetor,int primeiro , int segundo ){
		double primeiroIntermediario = vetor[primeiro];
		double segundoIntermediario = vetor[segundo];
	    vetor[primeiro] = segundoIntermediario;
	    vetor[segundo] = primeiroIntermediario;
		
	}
	
	private static int buscaMenor(double[] a,int x, int quantidadeDeElementos){
		int menor=x; 
		for(int atual = x; atual < quantidadeDeElementos; atual++) {
		        if(a[atual]< a[menor])
		        	menor=atual;
		    }
		return menor;
	}
	
}

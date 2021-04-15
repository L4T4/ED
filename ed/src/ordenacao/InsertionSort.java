package ordenacao;

public class InsertionSort {

	public InsertionSort() {
		
	}

	public void insertionSort(double[] a) {
		int in, daVez, n=a.length;
		for (daVez=1; daVez<n; daVez++) {
			in=daVez-1;
			double temp	=a[daVez];
			while(in>=0 && a[in]>=temp) {
				a[in+1] = a[in];
				in--;
			} 
			a[in+1]=temp ;
		}
	}
	
	
	private static void swap(double[] vetor,int primeiro , int segundo ){
		double primeiroIntermediario = vetor[primeiro];
	    double segundoIntermediario = vetor[segundo];
	    vetor[primeiro] = segundoIntermediario;
	    vetor[segundo] = primeiroIntermediario;
	}

	public static void insertionSort(double[] vetor, int quantidadeDeElementos) {
		 for (int atual = 1; atual < quantidadeDeElementos; atual++) {
		     int analise = atual;
		     while(analise > 0 && vetor[analise] < vetor[analise -1]) {
		         swap(vetor, analise, analise -1);
		         analise--;
		     }
		 }
	}

}

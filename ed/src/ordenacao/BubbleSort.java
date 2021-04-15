package ordenacao;

public class BubbleSort {

	public BubbleSort() {
		
	}
	
	public static void bubbleSort(double[] a,int quantidadeDeElementos) {
		int in, out;
		for(out=quantidadeDeElementos-1; out>0; out--)
		{	for(in=0; in<out; in++)
				if (a[in] > a[in+1])
					swap(a, in, in+1);
		}
	}
	
	private static void swap(double[] vetor,int primeiro , int segundo ){
		double primeiroIntermediario = vetor[primeiro];
	    double segundoIntermediario = vetor[segundo];
	    vetor[primeiro] = segundoIntermediario;
	    vetor[segundo] = primeiroIntermediario;
	}

}

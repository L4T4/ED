package ordenacao;

public class MergeSort {

	public MergeSort() {
		// TODO Auto-generated constructor stub
	}
	
	public static void mergeSort(double[] v, int inicial, int termino) {
		if((termino-inicial)>1){ 	//maior que 1 quantidade no array
			// encontra o meio
			int meio = (inicial+termino) / 2;
			// ordena 1a metade
			mergeSort(v, inicial, meio);
			// ordena 2a metade
			mergeSort(v, meio, termino);
			// intercala
			merge(v, inicial, meio, termino);
		} // end else
	}
	
	private static void merge(double[] v, int inicial, int miolo, int termino) {
		double[] total= new double[termino-inicial];
		
		int atual=0;
		int atual1=inicial;
		int atual2=miolo;
		while (atual1<miolo && atual2<termino) {
			if (v[atual1] < v[atual2]) {
				total[atual]=v[atual1];
				atual1++;
			} else {
				total[atual]=v[atual2];
				atual2++;
			}
			 atual++;
		}
		while (atual1<miolo) {
			total[atual]=v[atual1];
			atual1++;
			atual++;
		}
		while (atual2<termino) {
			total[atual]=v[atual2];
			atual2++;
			atual++;
		}
		for (int i=0; i<atual; i++)
			v[inicial+i] = total[i];
	}
	
}

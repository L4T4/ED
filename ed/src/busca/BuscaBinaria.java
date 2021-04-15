package busca;

public class BuscaBinaria {
	
	public static void buscaBinaria(){
		
	}
	
	public static int busca(double[] vetor, int de, int ate, double buscando) {
	    int meio = (de + ate) / 2;
	    double valor = vetor[meio];
	    
	    if(de>ate)		// se nao existir no array
	    {
	    	return -1;
	    }
	    
	    if(buscando == valor) {
	        return meio;
	    }
	    if(buscando < valor) {
	        return busca(vetor, de, meio -1, buscando);
	    }
	        return busca(vetor, meio + 1, ate, buscando);
	}
	
}

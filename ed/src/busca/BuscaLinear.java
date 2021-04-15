package busca;

public class BuscaLinear {

	public static int buscaLinear(double[] a,int de , int ate, double buscando ){
		for(int atual=de;atual< ate ; atual++)
		{	
			if(a[atual]==buscando)
			{
				return atual;
			}
		}
		return -1;
	}
	
	
	
}

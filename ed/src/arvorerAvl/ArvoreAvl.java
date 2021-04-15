package arvorerAvl;
import arvore.*;

public class ArvoreAvl extends Arvore {

	public ArvoreAvl() {
		super();
	}
	
	private static Celula rotacaoEsquerdaAvl(Celula celula){
		if(celula!= null && celula.getDireita()!=null)
		{
		Celula b=celula.getDireita();
		celula.setDireita(b.getEsquerda());
		b.setEsquerda(celula);
		return b;
		}
		else 
			return celula;
	}
	
	private static Celula rotacaoDireitaAvl(Celula celula){
		if(celula!=null && celula.getEsquerda()!=null)
		{
		Celula b=celula.getEsquerda();
		celula.setEsquerda(b.getDireita());
		b.setDireita(celula);
		return b;
		}
		else 
			return celula;
	}
	private static int calcularAlturaDireita(Celula celula){
		int x=0,y=0,z=0;
		if(celula != null){
	      
	         if(celula.getEsquerda()!=null && celula.getDireita()==null)
	        	 x=calcularAlturaEsquerda(celula.getEsquerda())+1;
	         if(celula.getDireita()!=null && celula.getEsquerda()==null)
	        	 x=calcularAlturaDireita(celula.getDireita())+1;
	         if(celula.getDireita()!=null && celula.getEsquerda() != null)
	        	{	y = calcularAlturaEsquerda(celula.getEsquerda())+1;
	         		z = calcularAlturaDireita(celula.getDireita())+1;
	         		if(y>z)
	         			x=y-z;
	         		else
	         			x=z-y;
	        	}
	      
		}
		else
			return 0;
		
		return x;
	}
	
	private static int calcularAlturaEsquerda(Celula celula){
		int x=0,y=0,z=0;
		if(celula != null){
	      
	         if(celula.getEsquerda()!=null && celula.getDireita()==null)
	        	 x=calcularAlturaEsquerda(celula.getEsquerda())+1;
	         if(celula.getDireita()!=null && celula.getEsquerda()==null)
	        	 x=calcularAlturaDireita(celula.getDireita())+1;
	         if(celula.getDireita()!=null && celula.getEsquerda() != null)
	        	{	y = calcularAlturaEsquerda(celula.getEsquerda())+1;
	         		z = calcularAlturaDireita(celula.getDireita())+1;
	         		if(y>z)
	         			x=y-z;
	         		else
	         			x=z-y;
	        	}
	      
		}
		else
			return 0;
		
		return x;
		
	}
	
	private static Celula balancearArvore(Celula celula){
		int fb=0;
		
		if(celula != null)
		{	Celula no=celula ;
			fb=calcularAlturaDireita(celula)- calcularAlturaEsquerda(celula);
			if(fb>1)
			{
				no=rotacaoEsquerdaAvl(no);
			}
			if(fb<1)
			{
				no=rotacaoDireitaAvl(no);
			}
			
			return no;
		}
		else
			return celula;
	}
	
	public void insere(Celula celula,int valor){
		 //verifica se a árvore já foi criada
	       if (celula != null) {
	        //Verifica se o valor a ser inserido é menor que o nodo corrente da árovre, se sim vai para subarvore esquerda
	        if (valor < celula.getElemento()) {
	            //Se tiver elemento no nodo esquerdo continua a busca
	            if (celula.getEsquerda() != null) {
	                insere(celula.getEsquerda(), valor);
	            } else {
	                //Se nodo esquerdo vazio insere o novo nodo aqui
	                System.out.println("  Inserindo " + valor + " a esquerda de " + celula.getElemento());
	                celula.setEsquerda(new Celula(valor));
	            }
	        //Verifica se o valor a ser inserido é maior que o nodo corrente da árvore, se sim vai para subarvore direita
	        } else if (valor > celula.getElemento()) {
	            //Se tiver elemento no nodo direito continua a busca
	            if (celula.getDireita() != null) {
	                insere(celula.getDireita(), valor);
	            } else {
	                //Se nodo direito vazio insere o novo nodo aqui
	                System.out.println("  Inserindo " + valor + " a direita de " + celula.getElemento());
	                celula.setDireita(new Celula(valor));
	            }
	        }
	      }
	      else
		      {
		    	  this.raiz= new Celula(valor); 
		      }
	}
	
	
}

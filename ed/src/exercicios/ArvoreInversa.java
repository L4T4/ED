package exercicios;

import arvore.*;

public class ArvoreInversa {
	
	public void inverte(Arvore arvore,Celula raiz){	
		
		if( raiz != null){
			inverte(arvore,raiz.getDireita());
			for(int x=0 ; x<calcularComprimento(arvore,raiz);x++)
				System.out.print("_"+" "+"_"+ " " + "_"+" ");
			System.out.println("_"+ raiz.getElemento()+"_");
			inverte(arvore,raiz.getEsquerda());
			
		}
	}
	
	public int calcularComprimento(Arvore arvore,Celula celula){
		int x=0;
		Celula raiz=arvore.raiz;		// pegara a raiz da arvore em uma variavel temporaria
		if(raiz != null){
	       while (celula.getElemento() != raiz.getElemento()) {
	               if(celula.getElemento()< raiz.getElemento()){
	            	   raiz = raiz.getEsquerda();
	    	   			x++;
	               }
	               if(celula.getElemento()> raiz.getElemento()){
	            	   raiz = raiz.getDireita();
	    	   			x++;
	               }
	        }
		}
	    
		return x;
	}
	
	
}

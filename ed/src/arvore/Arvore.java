package arvore;

public class Arvore {
		public static Celula raiz;
		
		public Arvore(){
			raiz=null;
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
		
		
		@SuppressWarnings("unused")
		public Celula remover(Celula celula, int valor) {
	        System.out.println("  Corendo No " + celula.getElemento());
	        if (celula == null) {
	            System.out.println("  Arvore vazia ");
	        }else if (valor < celula.getElemento()) {
	            celula.setEsquerda(remover(celula.getEsquerda(), valor));
	        } else if (valor > celula.getElemento()) {
	            celula.setDireita(remover(celula.getDireita(), valor));
	        } else if (celula.getEsquerda() != null && celula.getDireita()!= null)  // 2 filhos
	        {
	            System.out.println("  Removeu No " + celula.getElemento());
	            celula.setElemento(encontraMinimo(celula.getDireita()).getElemento());
	            celula.setDireita(removeValorMinimo(celula.getDireita()));
	        } else {
	            System.out.println("  Removeu No " + celula.getElemento());
	            celula = (celula.getEsquerda() == null) ? celula.getEsquerda() : celula.getDireita();
	        }
	        return celula;
	    }
		
		public Celula removeValorMinimo(Celula celula){
			 if (celula == null) {
		            System.out.println("  ERRO ");
		        } else if (celula.getEsquerda() != null) {
		            celula.setEsquerda(removeValorMinimo(celula.getEsquerda()));
		            return celula;
		        } else {
		        	//Se não tiver elemento esquerdo só nós resta o da direita
		            return celula.getDireita();
		        }
		        return null;
		}
		
		public Celula encontraMinimo(Celula celula) {
	        if (celula != null) {
	            while (celula.getEsquerda() != null) {
	                celula = celula.getEsquerda();
	            }
	        }
	        return celula;
	    }
		
		public void percursoPreOrdem(Celula celula){
			if( celula != null){
				System.out.print(celula.getElemento()+",");
				percursoPreOrdem(celula.getEsquerda());
				percursoPreOrdem(celula.getDireita());
			}
		}
		
		public void percursoPosOrdem(Celula celula){
			if( celula != null){
				percursoPosOrdem(celula.getEsquerda());
				percursoPosOrdem(celula.getDireita());
				System.out.print(celula.getElemento()+",");
			}
		}
		
		public void percursoEmOrdem(Celula celula){
			if( celula != null){
				percursoEmOrdem(celula.getEsquerda());
				System.out.print(celula.getElemento()+",");
				percursoEmOrdem(celula.getDireita());
			}
		}
		
}

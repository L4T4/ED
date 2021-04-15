package arvoreExpressao;
import java.util.LinkedList;
import java.util.Stack;


public class ArvoreExpressao {
		
		private Celula raiz;
		private LinkedList<int[][]> listaVariavel= new LinkedList<int[][]>();		// lista ligada para as variaveis
		
		public void montarArvore(String string){			// montar a arvore de expressoes
			Stack<Celula> pilha1 = new Stack<Celula>();		// tera 2 pilhas , uma para as variaveis e contantes , a outra para operadores
			Stack<Integer> pilha2 = new Stack<Integer>();
			for(int x=0 ; x < string.length() ; x++) {		// percorrera a string
				if(string.charAt(x)=='+' || string.charAt(x)=='*' || string.charAt(x)=='/'|| string.charAt(x)=='-'){		// se for algum dos operadores, o caracter sera tranformado em inteiro
					int tmp = (int)string.charAt(x);																		// e sera colocado na pilha dos operadores
					pilha2.push(tmp);
				}
				else{
					if(string.charAt(x)!='(' && string.charAt(x)!=')'){			// caso nao seja os parenteses e nem os operadores, sera uma variavel ou constante, que sera colocado na pilha das variaveis
						int tmp = Character.getNumericValue(string.charAt(x));		// sera transferido pelo seu numero exato caso seja contante, e nao pela tabela asc2
						if(tmp>9 || tmp<0){				// caso esteja fora do valor numerico , sera uma variavel, entao pegaremos o caracter pela tabela asc2
							tmp=(int)string.charAt(x);
						}
						Celula celula = new Celula(tmp);		// criaremos uma celula ja com a variavel e colocaremos na pilha, pois ela sera uma folha
						pilha1.push(celula);
					}
					if(string.charAt(x)==')'){			// se for o parentese que fecha a expressao, entao criaremos uma celula com o operador e suas variaveis a ser calculadas, que tiraremos das pilhas
						Celula celula = new Celula(pilha2.pop());			// e adicionaremos a pilha1 de variaveis
						celula.setDireita(pilha1.pop());
						celula.setEsquerda(pilha1.pop());
						pilha1.push(celula);
					}
				}
				
			}
			if(pilha1.size()!=1 || pilha2.isEmpty()==false)		// caso a pilha2 nao esteja vazia ou a pilha 1 nao ter 1 elemento , entao tem algum erro na expressao
				{System.out.println("Erro na expressão");}
			else
				{this.raiz=pilha1.pop();}	// caso contrario(a pilha 2 esteja vazia e a pilha1 tenha 1 elemento) entao a raiz sera o ultimo elemento da pilha
				
		}
		
		public void setVariavel(char v, int valor){		// iremos colocar a variavel e seu valor por meio de uma array multidimensional de int na lista
			int[][] var = {{(int)v},{valor}};	// converteremos a letra da variavel para o numero da tabela asc2 e colocaremos tambem o seu valor
			listaVariavel.add(var);
			
		}
		
		private void trocarVariavel(Celula celula,int var, int valor){	
			if(celula.getEsquerda()==null && celula.getDireita()==null)		// se a celula for uma folha entao sera uma contante ou variavel
			{
				if(celula.getValor()==var){	// se for uma variavel igual a variavel a ser trocada entao trocaremos a variavel pelo seu numero correspondente
					celula.setValor(valor);
				}
			}
			else{		// caso contrario pegaremos no sentido de pos ordem , atraves de uma funcao recursiva
				trocarVariavel(celula.getEsquerda(),var,valor);
				trocarVariavel(celula.getDireita(),var,valor);
			}
		}
		
		public int calcular(){		
			while(listaVariavel.isEmpty()!=true){		// enquanto a lista de variaveis nao estiver vazia , ainda tera variavel a ser substituida na arvore
				int[][] var = listaVariavel.removeFirst();	// pegaremos as variaveis 
				trocarVariavel(raiz,var[0][0],var[1][0]);	// e encontraremos ela na arvore para ser trocada pelo seu numero correspondente 
			}
			return percursoPosOrdem2(this.raiz);		// retornaremos o calculo com todas as variaveis substituidas pelo seu numero correspondente 
		}
		
		private int percursoPosOrdem2(Celula celula){		
			int x=0;
			if(celula != null){
				if(celula.getEsquerda()==null && celula.getDireita()==null ){	// se for uma folha , pegaremos o seu valor 
					x=celula.getValor();
				}
				else{	// caso contrario, faremos uma funcao recursiva para pegar as 2 folhas e seu operador , em pos ordem, e depois fazer o calculo da operacao  
					int op1= percursoPosOrdem2(celula.getEsquerda());
					int op2= percursoPosOrdem2(celula.getDireita());
					x=aplicarOperador(op1,op2,celula.getValor());
				}
			}
			return x;	
		}
		
		private int aplicarOperador(int op1,int op2, int op){		// fara o calculo 
			int x=0;
			switch(op){		// de acordo com a tabela asc , sabera se e multiplicacao, divisao , adicao ou subtracao , e entao resolvera a operacao de acordo com o seu tipo de operador
				case'+' : {	x=op1+ op2; break;}
				case'*' : {	x=op1* op2; break;}
				case'/' : {	x=op1/ op2; break;}
				case'-' : {	x=op1- op2; break;}
			}
			return x;		// retornara o valor do calculo
		}
}

package exercicios;
import pilha.Pilha;

public class PilhaAlgarismoNatural {
	
	private Pilha pilha;
	
	public void guardaNumero(int x){
		pilha= new Pilha();
		int intermediaria=x;
		while(intermediaria>=10)
		{
			pilha.push(intermediaria%10);
			intermediaria=intermediaria/10;
		}
		pilha.push(intermediaria);
	}
	
	public void imprimeNumero(){
		while(!pilha.isEmpty()){
			System.out.println(pilha.pop());
		}
	}
	
}

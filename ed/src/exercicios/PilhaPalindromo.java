package exercicios;

import java.util.Scanner;

import pilha.Pilha;

public class PilhaPalindromo {
	
	private Pilha pilha1;
	private Pilha pilha2;
	
	public void pegarPalindromo() {
		Pilha pilha=new Pilha();
		pilha1=new Pilha();
		pilha2=new Pilha();
		Scanner entrada = new Scanner(System.in);
		String caracter;
		char c = 0;
		
		while(c!='#'){
		System.out.println("Digite um caracter, quando quiser parar digite # :");
		caracter=entrada.next();
		c=caracter.charAt(0);
		if(c!= '#')
		{	pilha.push(c);
			pilha1.push(c);
		}
		}
		while(!pilha.isEmpty()){	// inverter palindromo em outra pilha 
			pilha2.push(pilha.pop());
		}
		
	}
	
	public boolean validarPalindromo(){
		char x;
		char y;
		while(pilha1.isEmpty()==false && pilha2.isEmpty()==false){
			try{
			x=(Character) pilha1.pop();
			y=(Character) pilha2.pop();
			if(x!=y)
			{
				return false;
			}
			}catch(IllegalArgumentException a){
				return false;
			}
		}
		return true;
		
	}
}

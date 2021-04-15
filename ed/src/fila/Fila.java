package fila;


public class Fila {
	
	private Celula primeira=null;
	private Celula ultima=null;
	private int totalDeElementos=0;
	
	public void enqueue(Object elemento){
		
		if(this.totalDeElementos==0)
		{
			Celula nova	=	new Celula(elemento);
			this.primeira=nova;
			this.ultima=this.primeira;
			this.totalDeElementos++;
			
		}
		else
		{
		Celula nova = new Celula(elemento);
		this.ultima.setProximo(nova);
		this.ultima=nova;
		this.totalDeElementos++;
		}
		
	}
	
	public Object dequeue(){
		if(!isEmpty())
		{
			Object x = primeira.getElemento();
			primeira=primeira.getProximo();
			this.totalDeElementos--;
			return x;
			
		}
		else
		{
			throw new IllegalArgumentException("fila vazia");
		}
	}
	
	public Object peek(){
		if(!isEmpty())
		{
			Object x = primeira.getElemento();
			return x;
		}
		else
		{
			throw new IllegalArgumentException("fila vazia");
		}
	}
	
	public int size(){
		return this.totalDeElementos;
	}
	
	public boolean isEmpty(){
		if(this.totalDeElementos==0)
			{return true;}
		else 
			{return false;}
	}
	
	@Override
	public String toString(){
		if(this.totalDeElementos==0)
			return "[]";
		else
		{
			Celula atual = this.primeira;
			StringBuilder builder = new StringBuilder("[");
			
			for(int i=0;i < totalDeElementos ; i++)
			{	builder.append(atual.getElemento());
				builder.append(",");
				atual=atual.getProximo();
			}
			
			builder.append("]");
			return builder.toString();
		}
		
	}
}

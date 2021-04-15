package pilha;


public class Pilha {
	
	private Celula topo=null;
	private int totalDeElementos=0;
	
	public void push(Object elemento){
		Celula nova	=	new Celula(elemento);
		nova.setProximo(topo);
		this.topo=nova;
		this.totalDeElementos++;
		}
	
	public Object pop(){
		if(!isEmpty())
		{
			Object x = topo.getElemento();
			topo=topo.getProximo();
			this.totalDeElementos--;
			return x;
			
		}
		else
		{
			throw new IllegalArgumentException("pilha vazia");
		}
	}
	
	public Object top(){
		if(!isEmpty())
		{
			Object x = topo.getElemento();
			return x;
		}
		else
		{
			throw new IllegalArgumentException("pilha vazia");
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
			Celula atual = this.topo;
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

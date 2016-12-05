package compilador;

import java.util.Stack;

public class Ast{
	private Nodo root;
	private Stack<Nodo> stack;
	
	public Ast(){
		root =null;
		stack = new Stack<Nodo>();
	}
	
	public Nodo getRoot(){
		return root;
	}
	
	public void setRoot(Nodo r){
		root = r;
	}
	
	public String getArbol(){
		return root.crearStringArbol();
	}
}
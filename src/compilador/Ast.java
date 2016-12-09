package compilador;

public class Ast{
	private Nodo raiz;
	
	public Ast(){
		raiz =null;
	}
	
	public Nodo getRaiz(){
		return raiz;
	}
	
	public void setRaiz(Nodo r){
		raiz = r;
	}
	
	public void imprimirArbol(){
		System.out.println("\nArbol de Análisis Sintactico (AST):\n");
		raiz.crearArbol("",true);
	}
}
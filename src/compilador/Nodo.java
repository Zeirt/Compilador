package compilador;

public class Nodo {
	private String valor;
	private String tipo;
	private boolean visitado;
	private Nodo lHijo, rHijo, espHijo;
	
	public Nodo(String v, String t, Nodo l, Nodo r){
		valor = v;
		tipo = t;
		visitado = false;
		lHijo = l;
		rHijo = r;
		espHijo = null; //hijo especial. Usado solo para ifs con else
	}
	
	public Nodo(String v, String t, Nodo l, Nodo r, Nodo e){
		valor = v;
		tipo = t;
		visitado = false;
		lHijo = l;
		rHijo = r;
		espHijo = e;
	}
	
	public String getValor(){
		return valor;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public boolean getVisitado(){
		return visitado;
	}
	
	public Nodo getLHijo(){
		return lHijo;
	}
	
	public Nodo getRHijo(){
		return rHijo;
	}
	
	public Nodo getEspHijo(){
		return espHijo;
	}
	
	public void setValor(String v){
		valor = v;
	}
	
	public void setTipo(String t){
		tipo = t;
	}
	
	public void setVisitado(boolean v){
		visitado = v;
	}
	
	public void setLHijo(Nodo n){
		lHijo = n;
	}
	
	public void setRHijo(Nodo n){
		rHijo = n;
	}
	
	public void setEspHijo(Nodo n){
		espHijo = n;
	}
	/*
	 * Todo: esto
	 */
	public String crearStringArbol(){
		String aux = "";
		return aux;
	}
}
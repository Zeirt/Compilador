package compilador;

import java.util.List;
import java.util.ArrayList;

public class Nodo {
	private String valor;
	private String tipo;
	private Nodo lHijo, rHijo, espHijo;
	private List<Nodo> hijos;
	
	/**
	 * Constructor de nodo normal (solo pide dos hijos)
	 * @param v valor
	 * @param t tipo
	 * @param l hijo izquierdo (si lo hay, si no null)
	 * @param r hijo derecho (si lo hay, si no null)
	 */
	public Nodo(String v, String t, Nodo l, Nodo r){
		valor = v;
		tipo = t;
		lHijo = l;
		rHijo = r;
		espHijo = null; //hijo especial. Usado solo para ifs con else
		hijos = new ArrayList<Nodo>();
		if(l==null){
			//No hacemos nada (no puedo hacer la comprobación al reves)
		} else hijos.add(l);
		if(r==null){
			
		}else hijos.add(r);
		
	}
	
	/**
	 * Constructor de nodo especial con tres hijos
	 * @param v valor
	 * @param t tipo
	 * @param l hijo izquierdo
	 * @param r hijo derecho
	 * @param e hijo especial
	 */
	public Nodo(String v, String t, Nodo l, Nodo r, Nodo e){
		valor = v;
		tipo = t;
		lHijo = l;
		rHijo = r;
		espHijo = e;
		hijos = new ArrayList<Nodo>();
		if(l==null){
			//No hacemos nada (no puedo hacer la comprobación al reves)
		} else hijos.add(l);
		if(r==null){
			
		}else hijos.add(r);
		if(e==null){
			
		}else hijos.add(e);
	}
	
	public String getValor(){
		return valor;
	}
	
	public String getTipo(){
		return tipo;
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
	
	public void setLHijo(Nodo n){
		lHijo = n;
	}
	
	public void setRHijo(Nodo n){
		rHijo = n;
	}
	
	public void setEspHijo(Nodo n){
		espHijo = n;
	}
	
	/**
	 * Imprimidor de arbol. 
	 * Funciona de manera recursiva, escribiendo una columna por hijo y llamando el mismo método para estos, tabulando.
	 * Comienza siendo llamado por Ast con los parámetros nombre vacío y esCola como verdadero para saber que está empezando.
	 * @param nombre texto a imprimir. Empezar con string vacio
	 * @param esCola. Es último hijo del nivel anterior?
	 */
	public void crearArbol(String nombre, boolean esCola){
		System.out.println(nombre + (esCola ? ".-- " : ":-- ") + valor);
		//si esCola, imprime fin de columna (.--), si no, imprime continuación (:--)
        for (int i = 0; i < hijos.size() - 1; i++) {
        	//tantas veces como hijos tenga - 1 (hijos no cola)
            hijos.get(i).crearArbol(nombre + (esCola ? "    " : ":   "), false);
            //si es cola, añade un espacio. Si no, continua la columna
        }
        if (hijos.size() > 0) {
        	//si hay al menos un hijo
            hijos.get(hijos.size() - 1).crearArbol(nombre + (esCola ?"    " : ":   "), true);
            //ultimo hijo será cola
        }
	}
}
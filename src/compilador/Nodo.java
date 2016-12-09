package compilador;

import java.util.List;
import java.util.ArrayList;

public class Nodo {
	private String valor;
	private String tipo;
	private Nodo lHijo, rHijo, espHijo;
	private List<Nodo> hijos;
	
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
	/*
	 * Imprimidor de arbol. 
	 * Funciona de manera recursiva, escribiendo una columna por hijo y llamando el mismo método para estos, tabulando.
	 * Comienza siendo llamado por Ast con los parámetros nombre vacío y esCola como verdadero para saber que está empezando.
	 */
	public void crearArbol(String nombre, boolean esCola){
		System.out.println(nombre + (esCola ? ".-- " : ":-- ") + valor);
        for (int i = 0; i < hijos.size() - 1; i++) {
            hijos.get(i).crearArbol(nombre + (esCola ? "    " : ":   "), false);
        }
        if (hijos.size() > 0) {
            hijos.get(hijos.size() - 1)
                    .crearArbol(nombre + (esCola ?"    " : ":   "), true);
        }
	}
}
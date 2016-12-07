package compilador;

import java.util.HashMap;

public class TablaSimbolos{
	
	HashMap<String,String> tablaTipos;
	//Claves son los identificadores. Valores son los tipos
	//Tipos posibles: Integer, Boolean, Undefined, Pseudo
	HashMap<String,Boolean> tablaInicializado;
	//Clave los identificadores. Valores es si esta inicializado o no (se hara al asignar)
	
	/**
	 * Constructor de TablaSimbolos. 
	 * Inicializa el hashmap.
	 */
	public TablaSimbolos(){
		tablaTipos = new HashMap<String,String>();
		tablaInicializado = new HashMap<String,Boolean>();
	}
	
	/**
	 * Comprueba si un símbolo existe en la tabla y devuelve su tipo.
	 * Si no existe, devuelve "Undefined"
	 * @param s simbolo a comprobar
	 * @return tipo de simbolo
	 */
	public String getSimbolo(String s){
		if(tablaTipos.containsKey(s))return tablaTipos.get(s);
		else return "Undefined";
	}
	
	/**
	 * Inserta un símbolo en la tabla (no comprueba si está ya)
	 * @param s símbolo a asociar
	 * @param t tipo del símbolo
	 */
	public void insertarSimbolo(String s, String t){
		tablaTipos.put(s, t);
		tablaInicializado.put(s, false);
	}
	/**
	 * Devuelve el estado de inicializacion de un simbolo de la tabla
	 * @param s simbolo a buscar
	 * @return inicializado o no
	 */
	public boolean estaInicializado(String s){
		return tablaInicializado.get(s);
	}
	/**
	 * Coloca el símbolo de la tabla como inicializado. Si ya lo es, no hace nada
	 * @param s a actualizar
	 */
	public void inicializarSimbolo(String s){
		if(!tablaInicializado.get(s)){
			tablaInicializado.remove(s);
			tablaInicializado.put(s, true);
		}
	}
}
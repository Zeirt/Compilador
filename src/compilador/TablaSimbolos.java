package compilador;

import java.util.HashMap;

public class TablaSimbolos{
	
	HashMap<String,String> tabla;
	//Claves son los identificadores. Valores son los tipos
	//Tipos posibles: Integer, Boolean, Undefined, Pseudo
	
	/**
	 * Constructor de TablaSimbolos. 
	 * Inicializa el hashmap.
	 */
	public TablaSimbolos(){
		tabla = new HashMap<String,String>();
	}
	
	/**
	 * Comprueba si un símbolo existe en la tabla y devuelve su tipo.
	 * Si no existe, devuelve "Void"
	 * @param s simbolo a comprobar
	 * @return tipo de simbolo
	 */
	public String getSimbolo(String s){
		if(tabla.containsKey(s))return tabla.get(s);
		else return "Void";
	}
	
	/**
	 * Inserta un símbolo en la tabla (no comprueba si está ya)
	 * @param s símbolo a asociar
	 * @param t tipo del símbolo
	 */
	public void insertarSimbolo(String s, String t){
		tabla.put(s, t);
	}
}
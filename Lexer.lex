package compilador;

import java_cup.runtime.*;

import java.io.*;
import java.util.ArrayList;


%%

// OPTIONES, DECLARACIONES Y MACROS 

%class Scan
%unicode               
%line                  
%column                 
%cup           


%init{ 
   yyline = 1; 
   yycolumn = 1; 
%init} 

%eofval{ 
   return new Symbol(ParserSym.EOF); 
%eofval} 

%{

/* Metodo de escribir tokens por pantalla. */
private void escribirToken(String nom) throws IOException{
	System.out.println(nom + " [" + yyline + "," + yycolumn + "," + yytext() + "]");
}

private boolean hayErrores = false;

/* Metodo de crear error*/
private void hayError(){
	hayErrores = true;
}

public boolean devolverErrores(){
	return hayErrores;
}
%}
// MACROS.

//Macros para todas las palabras reservadas

Program = program

Is = is

Begin = begin

End = end

Var = var

Integer = integer

Boolean = boolean

Read = read

Write = write

Skip = skip

While = while

Do = do

If = if

Then = then

Else = else

And = and

Or = or

Not = not

//Macros para booleanos

True = true

False = false

Identificador  = [a-zA-Z][a-zA-Z0-9_]*   //Macro para identificadores 

Asignacion  = ":="                       //Macro para operadores de asignación

//Macros para operadores de relacion

MenorIgual = "<="

Menor = "<"

Igual = "="

Mayor = ">"

MayorIgual = ">="

DistintoA = "<>"

//Macros para operadores matematicos

Suma = "+"

Resta = -

Multiplicacion = "*"

Division = "/"

//Macros para signos de punciacion

PuntoComa = ";"

AbrirParentesis = "("

CerrarParentesis = ")"

Coma = ","

DosPuntos = ":"

Entero = ("+"|"-")? [0-9]+       //Macro para numeros enteros. Va a confundir un signo matematico + o - si estan junto a un numero

%%
// REGLA LEXICAS Y ACCIONES

{Program} {escribirToken("Program");
			return new Symbol(ParserSym.PROGRAM, yyline, yycolumn, yytext());}              /* Codigo ejecutado cuando se encuentra un Program */

{Is}     	  {escribirToken("Is");
			   return new Symbol(ParserSym.IS, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Is */

{Begin}     {escribirToken("Begin");
				return new Symbol(ParserSym.BEGIN, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Begin */

{End}     {escribirToken("End");
				return new Symbol(ParserSym.END, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un End */

{Var}     {escribirToken("Var");
				return new Symbol(ParserSym.VAR, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Var */

{Integer}     {escribirToken("Integer");
				return new Symbol(ParserSym.INTEGER, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Integer */

{Boolean}     {escribirToken("Boolean");
				return new Symbol(ParserSym.BOOLEAN, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Boolean */

{Read}     {escribirToken("Read");
				return new Symbol(ParserSym.READ, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Read */

{Write}     {escribirToken("Write");
				return new Symbol(ParserSym.WRITE, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Write */

{Skip}     {escribirToken("Skip");
				return new Symbol(ParserSym.SKIP, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Skip */

{While}     {escribirToken("While");
				return new Symbol(ParserSym.WHILE, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un While */

{Do}     {escribirToken("Do");
				return new Symbol(ParserSym.DO, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Do */

{If}     {escribirToken("If");
				return new Symbol(ParserSym.IF, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un If */

{Then}     {escribirToken("Then");
				return new Symbol(ParserSym.THEN, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Then */

{Else}     {escribirToken("Else");
				return new Symbol(ParserSym.ELSE, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Else */

{And}     {escribirToken("And");
				return new Symbol(ParserSym.AND, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un And */

{Or}     {escribirToken("Or");
				return new Symbol(ParserSym.OR, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Or */

{Not}     {escribirToken("Not");
				return new Symbol(ParserSym.NOT, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Not */

{True}     {escribirToken("True");
				return new Symbol(ParserSym.TRUE, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un True */

{False}     {escribirToken("False");
				return new Symbol(ParserSym.FALSE, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un False */
				
{Identificador} {escribirToken("Identificador");
				return new Symbol(ParserSym.IDENTIFICADOR, yyline, yycolumn, yytext());}                 /* Codigo ejecutado cuando se encuentra un Identificador */

{Asignacion}    {escribirToken("Asignacion");
				return new Symbol(ParserSym.ASIGNACION, yyline, yycolumn, yytext());}                    /* Codigo ejecutado cuando se encuentra un Asignacion */

{MenorIgual}     {escribirToken("MenorIgual");
				return new Symbol(ParserSym.MENORIGUAL, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un MenorIgual */

{Menor}     {escribirToken("Menor");
				return new Symbol(ParserSym.MENOR, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Menor */

{Igual}     {escribirToken("Igual");
				return new Symbol(ParserSym.IGUAL, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Igual */

{Mayor}     {escribirToken("Mayor");
				return new Symbol(ParserSym.MAYOR, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Mayor */

{MayorIgual}     {escribirToken("MayorIgual");
				return new Symbol(ParserSym.MAYORIGUAL, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un MayorIgual */

{DistintoA}     {escribirToken("DistintoA");
				return new Symbol(ParserSym.DISTINTOA, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un DistintoA */

{Suma}     {escribirToken("Suma");
				return new Symbol(ParserSym.SUMA, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Suma */

{Resta}     {escribirToken("Resta");
				return new Symbol(ParserSym.RESTA, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Resta */

{Multiplicacion}     {escribirToken("Multiplicacion");
				return new Symbol(ParserSym.MULTIPLICACION, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Multiplicacion */

{Division}     {escribirToken("Division");
				return new Symbol(ParserSym.DIVISION, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Division */

{PuntoComa}     {escribirToken("PuntoComa");
				return new Symbol(ParserSym.PUNTOCOMA, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un PuntoComa */

{AbrirParentesis}     {escribirToken("AbrirParentesis");
				return new Symbol(ParserSym.ABRIRPARENTESIS, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un AbrirParentesis */

{CerrarParentesis}     {escribirToken("CerrarParentesis");
				return new Symbol(ParserSym.CERRARPARENTESIS, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un CerrarParentesis */

{Coma}     {escribirToken("Coma");
				return new Symbol(ParserSym.COMA, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un Coma */

{DosPuntos}     {escribirToken("DosPuntos");
				return new Symbol(ParserSym.DOSPUNTOS, yyline, yycolumn, yytext());}                     /* Codigo ejecutado cuando se encuentra un DosPuntos */

{Entero}        {escribirToken("Entero");
				return new Symbol(ParserSym.ENTERO, yyline, yycolumn, yytext());}                        /* Codigo ejecutado cuando se encuentra un Entero */

\ |\t|\r|\n|\r\n|\u2028|\u2029|\u000B|\u000C|\u0085 {                                                    /* Regla lexica para evitar estrellarse cuando se encuentra un espacio, tabulador o EOL, en realidad, no hacemos nada */}           

<<EOF>>         {return new Symbol(ParserSym.EOF, yyline, yycolumn, yytext());                           /* Cuando se encuentra EOF, acaba */}  

.               {hayError();
				System.err.println("Error léxico: caracter no definido en " +yyline + "," + yycolumn +" : " + yytext());    /* Regla lexica para evitar estrellarse cuando se encuentra algo extraño. Informamos a usuario */}                

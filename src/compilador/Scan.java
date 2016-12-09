/* The following code was generated by JFlex 1.4.3 on 9/12/16 15:35 */

package compilador;

import java_cup.runtime.*;

import java.io.*;
import java.util.ArrayList;



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 9/12/16 15:35 from the specification file
 * <tt>I:/5o cuatrimestre/Procesadores de Lenguaje/Workspace Eclipse/Compilador/Lexer.lex</tt>
 */
class Scan implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\44\1\46\1\44\1\44\1\45\22\0\1\44\7\0\1\40"+
    "\1\41\1\35\1\33\1\42\1\34\1\0\1\36\12\43\1\27\1\37"+
    "\1\31\1\30\1\32\2\0\32\25\4\0\1\26\1\0\1\5\1\11"+
    "\1\25\1\14\1\12\1\23\1\4\1\22\1\7\1\25\1\21\1\17"+
    "\1\6\1\13\1\3\1\1\1\25\1\2\1\10\1\16\1\24\1\15"+
    "\1\20\3\25\12\0\1\44\u1fa2\0\1\44\1\44\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\17\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\2\20\2\2\1\21\1\2\1\22\1\2\1\23\6\2"+
    "\1\24\6\2\1\25\1\26\1\27\1\30\2\2\1\31"+
    "\4\2\1\32\1\2\1\33\1\34\6\2\1\35\1\2"+
    "\1\36\2\2\1\37\1\40\1\41\6\2\1\42\1\43"+
    "\1\44\1\45\3\2\1\46\1\47\1\50";

  private static int [] zzUnpackAction() {
    int [] result = new int[97];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\116\0\165\0\234\0\303\0\352\0\u0111"+
    "\0\u0138\0\u015f\0\u0186\0\u01ad\0\u01d4\0\u01fb\0\u0222\0\u0249"+
    "\0\u0270\0\u0297\0\47\0\u02be\0\u02e5\0\u030c\0\u030c\0\47"+
    "\0\47\0\47\0\47\0\47\0\47\0\u030c\0\47\0\u0333"+
    "\0\u035a\0\u0381\0\303\0\u03a8\0\303\0\u03cf\0\303\0\u03f6"+
    "\0\u041d\0\u0444\0\u046b\0\u0492\0\u04b9\0\303\0\u04e0\0\u0507"+
    "\0\u052e\0\u0555\0\u057c\0\u05a3\0\47\0\47\0\47\0\47"+
    "\0\u05ca\0\u05f1\0\303\0\u0618\0\u063f\0\u0666\0\u068d\0\303"+
    "\0\u06b4\0\303\0\303\0\u06db\0\u0702\0\u0729\0\u0750\0\u0777"+
    "\0\u079e\0\303\0\u07c5\0\303\0\u07ec\0\u0813\0\303\0\303"+
    "\0\303\0\u083a\0\u0861\0\u0888\0\u08af\0\u08d6\0\u08fd\0\303"+
    "\0\303\0\303\0\303\0\u0924\0\u094b\0\u0972\0\303\0\303"+
    "\0\303";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[97];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\6\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\6"+
    "\1\20\2\6\1\21\2\6\1\2\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\37\50\0\1\6\1\41"+
    "\24\6\14\0\1\6\4\0\11\6\1\42\14\6\14\0"+
    "\1\6\4\0\1\6\1\43\24\6\14\0\1\6\4\0"+
    "\26\6\14\0\1\6\4\0\12\6\1\44\13\6\14\0"+
    "\1\6\4\0\7\6\1\45\2\6\1\46\7\6\1\47"+
    "\3\6\14\0\1\6\4\0\20\6\1\50\5\6\14\0"+
    "\1\6\4\0\2\6\1\51\6\6\1\52\14\6\14\0"+
    "\1\6\4\0\12\6\1\53\3\6\1\54\7\6\14\0"+
    "\1\6\4\0\2\6\1\55\23\6\14\0\1\6\4\0"+
    "\2\6\1\56\23\6\14\0\1\6\4\0\4\6\1\57"+
    "\21\6\14\0\1\6\4\0\1\6\1\60\17\6\1\61"+
    "\4\6\14\0\1\6\4\0\1\6\1\62\17\6\1\63"+
    "\4\6\14\0\1\6\4\0\4\6\1\64\21\6\14\0"+
    "\1\6\33\0\1\65\46\0\1\66\1\0\1\67\44\0"+
    "\1\70\61\0\1\36\51\0\1\37\1\0\2\6\1\71"+
    "\23\6\14\0\1\6\4\0\4\6\1\72\21\6\14\0"+
    "\1\6\4\0\13\6\1\73\12\6\14\0\1\6\4\0"+
    "\15\6\1\74\10\6\14\0\1\6\4\0\6\6\1\75"+
    "\17\6\14\0\1\6\4\0\2\6\1\76\23\6\14\0"+
    "\1\6\4\0\3\6\1\77\22\6\14\0\1\6\4\0"+
    "\13\6\1\100\12\6\14\0\1\6\4\0\7\6\1\101"+
    "\16\6\14\0\1\6\4\0\15\6\1\102\10\6\14\0"+
    "\1\6\4\0\1\6\1\103\24\6\14\0\1\6\4\0"+
    "\23\6\1\104\2\6\14\0\1\6\4\0\11\6\1\105"+
    "\14\6\14\0\1\6\4\0\6\6\1\106\17\6\14\0"+
    "\1\6\4\0\6\6\1\107\17\6\14\0\1\6\4\0"+
    "\16\6\1\110\7\6\14\0\1\6\4\0\3\6\1\111"+
    "\22\6\14\0\1\6\4\0\13\6\1\112\12\6\14\0"+
    "\1\6\4\0\11\6\1\113\14\6\14\0\1\6\4\0"+
    "\1\114\25\6\14\0\1\6\4\0\16\6\1\115\7\6"+
    "\14\0\1\6\4\0\6\6\1\116\17\6\14\0\1\6"+
    "\4\0\11\6\1\117\14\6\14\0\1\6\4\0\11\6"+
    "\1\120\14\6\14\0\1\6\4\0\12\6\1\121\13\6"+
    "\14\0\1\6\4\0\15\6\1\122\10\6\14\0\1\6"+
    "\4\0\16\6\1\123\7\6\14\0\1\6\4\0\7\6"+
    "\1\124\16\6\14\0\1\6\4\0\1\6\1\125\24\6"+
    "\14\0\1\6\4\0\3\6\1\126\22\6\14\0\1\6"+
    "\4\0\11\6\1\127\14\6\14\0\1\6\4\0\12\6"+
    "\1\130\13\6\14\0\1\6\4\0\11\6\1\131\14\6"+
    "\14\0\1\6\4\0\11\6\1\132\14\6\14\0\1\6"+
    "\4\0\11\6\1\133\14\6\14\0\1\6\4\0\4\6"+
    "\1\134\21\6\14\0\1\6\4\0\11\6\1\135\14\6"+
    "\14\0\1\6\4\0\4\6\1\136\21\6\14\0\1\6"+
    "\4\0\5\6\1\137\20\6\14\0\1\6\4\0\1\6"+
    "\1\140\24\6\14\0\1\6\4\0\12\6\1\141\13\6"+
    "\14\0\1\6\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2457];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\20\1\1\11\4\1\6\11\1\1\1\11"+
    "\25\1\4\11\51\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[97];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

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


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Scan(java.io.Reader in) {
     yyline = 1; 
   yycolumn = 1; 
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Scan(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 116) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 7: 
          { escribirToken("Suma");
				return new Symbol(ParserSym.SUMA, yyline, yycolumn, yytext());
          }
        case 41: break;
        case 3: 
          { escribirToken("DosPuntos");
				return new Symbol(ParserSym.DOSPUNTOS, yyline, yycolumn, yytext());
          }
        case 42: break;
        case 15: 
          { escribirToken("Entero");
				return new Symbol(ParserSym.ENTERO, yyline, yycolumn, yytext());
          }
        case 43: break;
        case 38: 
          { escribirToken("Program");
			return new Symbol(ParserSym.PROGRAM, yyline, yycolumn, yytext());
          }
        case 44: break;
        case 32: 
          { escribirToken("True");
				return new Symbol(ParserSym.TRUE, yyline, yycolumn, yytext());
          }
        case 45: break;
        case 29: 
          { escribirToken("Read");
				return new Symbol(ParserSym.READ, yyline, yycolumn, yytext());
          }
        case 46: break;
        case 17: 
          { escribirToken("Or");
				return new Symbol(ParserSym.OR, yyline, yycolumn, yytext());
          }
        case 47: break;
        case 19: 
          { escribirToken("If");
				return new Symbol(ParserSym.IF, yyline, yycolumn, yytext());
          }
        case 48: break;
        case 31: 
          { escribirToken("Else");
				return new Symbol(ParserSym.ELSE, yyline, yycolumn, yytext());
          }
        case 49: break;
        case 8: 
          { escribirToken("Resta");
				return new Symbol(ParserSym.RESTA, yyline, yycolumn, yytext());
          }
        case 50: break;
        case 33: 
          { escribirToken("Then");
				return new Symbol(ParserSym.THEN, yyline, yycolumn, yytext());
          }
        case 51: break;
        case 14: 
          { escribirToken("Coma");
				return new Symbol(ParserSym.COMA, yyline, yycolumn, yytext());
          }
        case 52: break;
        case 30: 
          { escribirToken("Skip");
				return new Symbol(ParserSym.SKIP, yyline, yycolumn, yytext());
          }
        case 53: break;
        case 1: 
          { hayError();
				System.err.println("Error l�xico: caracter no definido en " +yyline + "," + yycolumn +" : " + yytext());    /* Regla lexica para evitar estrellarse cuando se encuentra algo extra�o. Informamos a usuario */
          }
        case 54: break;
        case 35: 
          { escribirToken("Write");
				return new Symbol(ParserSym.WRITE, yyline, yycolumn, yytext());
          }
        case 55: break;
        case 21: 
          { escribirToken("Asignacion");
				return new Symbol(ParserSym.ASIGNACION, yyline, yycolumn, yytext());
          }
        case 56: break;
        case 16: 
          { /* Regla lexica para evitar estrellarse cuando se encuentra un espacio, tabulador o EOL, en realidad, no hacemos nada */
          }
        case 57: break;
        case 5: 
          { escribirToken("Menor");
				return new Symbol(ParserSym.MENOR, yyline, yycolumn, yytext());
          }
        case 58: break;
        case 13: 
          { escribirToken("CerrarParentesis");
				return new Symbol(ParserSym.CERRARPARENTESIS, yyline, yycolumn, yytext());
          }
        case 59: break;
        case 22: 
          { escribirToken("MenorIgual");
				return new Symbol(ParserSym.MENORIGUAL, yyline, yycolumn, yytext());
          }
        case 60: break;
        case 12: 
          { escribirToken("AbrirParentesis");
				return new Symbol(ParserSym.ABRIRPARENTESIS, yyline, yycolumn, yytext());
          }
        case 61: break;
        case 4: 
          { escribirToken("Igual");
				return new Symbol(ParserSym.IGUAL, yyline, yycolumn, yytext());
          }
        case 62: break;
        case 25: 
          { escribirToken("And");
				return new Symbol(ParserSym.AND, yyline, yycolumn, yytext());
          }
        case 63: break;
        case 6: 
          { escribirToken("Mayor");
				return new Symbol(ParserSym.MAYOR, yyline, yycolumn, yytext());
          }
        case 64: break;
        case 40: 
          { escribirToken("Boolean");
				return new Symbol(ParserSym.BOOLEAN, yyline, yycolumn, yytext());
          }
        case 65: break;
        case 23: 
          { escribirToken("DistintoA");
				return new Symbol(ParserSym.DISTINTOA, yyline, yycolumn, yytext());
          }
        case 66: break;
        case 11: 
          { escribirToken("PuntoComa");
				return new Symbol(ParserSym.PUNTOCOMA, yyline, yycolumn, yytext());
          }
        case 67: break;
        case 36: 
          { escribirToken("While");
				return new Symbol(ParserSym.WHILE, yyline, yycolumn, yytext());
          }
        case 68: break;
        case 39: 
          { escribirToken("Integer");
				return new Symbol(ParserSym.INTEGER, yyline, yycolumn, yytext());
          }
        case 69: break;
        case 26: 
          { escribirToken("End");
				return new Symbol(ParserSym.END, yyline, yycolumn, yytext());
          }
        case 70: break;
        case 24: 
          { escribirToken("MayorIgual");
				return new Symbol(ParserSym.MAYORIGUAL, yyline, yycolumn, yytext());
          }
        case 71: break;
        case 20: 
          { escribirToken("Do");
				return new Symbol(ParserSym.DO, yyline, yycolumn, yytext());
          }
        case 72: break;
        case 18: 
          { escribirToken("Is");
			   return new Symbol(ParserSym.IS, yyline, yycolumn, yytext());
          }
        case 73: break;
        case 28: 
          { escribirToken("Var");
				return new Symbol(ParserSym.VAR, yyline, yycolumn, yytext());
          }
        case 74: break;
        case 37: 
          { escribirToken("False");
				return new Symbol(ParserSym.FALSE, yyline, yycolumn, yytext());
          }
        case 75: break;
        case 10: 
          { escribirToken("Division");
				return new Symbol(ParserSym.DIVISION, yyline, yycolumn, yytext());
          }
        case 76: break;
        case 34: 
          { escribirToken("Begin");
				return new Symbol(ParserSym.BEGIN, yyline, yycolumn, yytext());
          }
        case 77: break;
        case 2: 
          { escribirToken("Identificador");
				return new Symbol(ParserSym.IDENTIFICADOR, yyline, yycolumn, yytext());
          }
        case 78: break;
        case 9: 
          { escribirToken("Multiplicacion");
				return new Symbol(ParserSym.MULTIPLICACION, yyline, yycolumn, yytext());
          }
        case 79: break;
        case 27: 
          { escribirToken("Not");
				return new Symbol(ParserSym.NOT, yyline, yycolumn, yytext());
          }
        case 80: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {
                return new Symbol(ParserSym.EOF, yyline, yycolumn, yytext());                           /* Cuando se encuentra EOF, acaba */
              }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

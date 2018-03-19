package org.eventb.codegen.taskbodybuilder;
/* Generated By:JavaCC: Do not edit this line. TaskingGrammar.java */
import java.io.UnsupportedEncodingException;

//	CHRIS HAS EDITED THIS FILE MANUALLY
public class TaskingGrammar implements TaskingGrammarConstants {
                public String error_message = "";

        public void parseAndBuild(String inputString)  throws ParseException, UnsupportedEncodingException{
                error_message = "";
            {
              try
              {
                switch (input())
                {
                  case 0 :
                  break;
                  case 1 :
                  break;
                  default :
                  break;
                }
              }
              catch (Exception e)
              {
                error_message = e.getMessage();
              }
              catch (Error e)
              {
                error_message = e.getMessage();
              }
            }
        }

  final public int input() throws ParseException {
    clause();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SEQ:
        ;
        break;
      //	CHRIS ADDED - AS WAS JUST ABORTING IF IT DIDN'T FIND SEQ
      case NAME:
      case STRING:
      case IF:
      case ELSEIF:
      case ELSE:
      case DO:
      case FINALLY:
      case OUTPUT:
    	  //	ERROR - SHOULD HAVE A SEQ NEXT
    	//  ParseException e = generateParseException();
    	  
    	// throw e;
    	  throw new ParseException("Missing ; after " + token);
      default:
        jj_la1[0] = jj_gen;		
        break label_1;
      }
      jj_consume_token(SEQ);
      clause();
    }
  {if (true) return 0;}
    throw new Error("Missing return statement in function");
  }

  final public void element() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IF:
    case DO:
    case OUTPUT:
    case NAME:
      clause();
      break;
    case 16:
      jj_consume_token(16);
      clause();
      jj_consume_token(17);
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void clause() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NAME:
      jj_consume_token(NAME);
      break;
    case IF:
      jj_consume_token(IF);
      jj_consume_token(NAME);
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ELSEIF:
          ;
          break;
        default:
          jj_la1[2] = jj_gen;
          break label_2;
        }
        jj_consume_token(ELSEIF);
        jj_consume_token(NAME);
      }
      jj_consume_token(ELSE);
      jj_consume_token(NAME);
      break;
    case DO:
      jj_consume_token(DO);
      jj_consume_token(NAME);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case FINALLY:
        jj_consume_token(FINALLY);
        jj_consume_token(NAME);
        break;
      default:
        jj_la1[3] = jj_gen;
        ;
      }
      break;
    case OUTPUT:
      jj_consume_token(OUTPUT);
      jj_consume_token(STRING);
      jj_consume_token(NAME);
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  /** Generated Token Manager. */
  public TaskingGrammarTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[5];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x20,0x11a40,0x80,0x400,0x1a40,};
   }

  /** Constructor with InputStream. */
  public TaskingGrammar(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public TaskingGrammar(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new TaskingGrammarTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public TaskingGrammar(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new TaskingGrammarTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public TaskingGrammar(TaskingGrammarTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(TaskingGrammarTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[18];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 5; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 18; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

}
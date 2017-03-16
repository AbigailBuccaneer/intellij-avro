/* The following code was generated by JFlex 1.7.0-SNAPSHOT tweaked for IntelliJ platform */

package claims.bold.intellij.avro.idl;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static claims.bold.intellij.avro.idl.psi.AvroIdlTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0-SNAPSHOT
 * from the specification file <tt>_AvroIdlLexer.flex</tt>
 */
public class _AvroIdlLexer implements FlexLexer {

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
   * Chosen bits are [12, 6, 3]
   * Total runtime size is 15488 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>9]<<6)|((ch>>3)&0x3f)]<<3)|(ch&0x7)];
  }

  /* The ZZ_CMAP_Z table has 2176 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
    "\20\5\21\1\22\1\23\1\24\1\21\14\25\1\26\50\25\1\27\2\25\1\30\1\31\1\32\1\33"+
    "\25\25\1\34\20\21\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\21\1\44\1\45\1\46\1"+
    "\21\1\47\1\50\1\51\1\52\1\53\3\21\1\25\1\54\1\55\5\21\2\25\1\56\31\21\1\25"+
    "\1\57\1\21\1\60\40\21\1\61\17\21\1\62\1\63\1\64\1\65\13\21\1\66\10\21\123"+
    "\25\1\67\7\25\1\70\1\71\37\21\1\25\1\71\u0582\21\1\72\u017f\21");

  /* The ZZ_CMAP_Y table has 3776 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1"+
    "\17\3\0\1\20\1\21\1\22\1\23\2\11\1\24\3\11\1\24\71\11\1\25\1\11\1\26\1\27"+
    "\1\30\1\31\2\27\16\0\1\32\1\33\1\34\1\35\2\11\1\36\11\11\1\37\21\11\1\40\1"+
    "\41\23\11\1\27\1\42\3\11\1\24\1\43\1\42\4\11\1\44\1\45\4\0\1\46\1\47\1\27"+
    "\3\11\2\50\1\27\1\51\1\52\1\0\1\53\5\11\1\54\2\0\1\55\1\56\1\57\13\11\1\60"+
    "\1\46\1\61\1\62\1\55\1\63\1\27\1\64\1\65\3\11\3\0\1\66\12\11\1\67\1\0\1\70"+
    "\1\27\1\55\1\71\3\11\1\54\1\72\1\23\2\11\1\67\1\73\1\74\1\75\2\27\3\11\1\76"+
    "\10\27\1\77\1\30\6\27\1\100\2\0\1\101\1\102\6\11\1\103\2\0\1\104\1\11\1\105"+
    "\1\55\2\42\1\106\1\107\1\110\2\11\1\77\1\111\1\112\1\113\1\114\1\64\1\115"+
    "\1\105\1\55\1\116\1\52\1\106\1\117\1\110\2\11\1\77\1\120\1\121\1\122\1\123"+
    "\1\124\1\125\1\126\1\55\1\127\1\27\1\106\1\37\1\36\2\11\1\77\1\130\1\112\1"+
    "\46\1\131\1\132\1\27\1\105\1\55\1\43\1\27\1\106\1\107\1\110\2\11\1\77\1\130"+
    "\1\112\1\113\1\123\1\133\1\115\1\105\1\55\1\43\1\27\1\134\1\135\1\136\1\137"+
    "\1\140\1\135\1\11\1\141\1\142\1\143\1\144\1\27\1\126\1\55\1\27\1\43\1\106"+
    "\1\32\1\77\2\11\1\77\1\145\1\146\1\147\1\143\1\150\1\26\1\105\1\55\2\27\1"+
    "\151\1\32\1\77\2\11\1\77\1\145\1\112\1\147\1\143\1\150\1\34\1\105\1\55\1\152"+
    "\1\27\1\151\1\32\1\77\4\11\1\153\1\147\1\154\1\64\1\27\1\105\1\55\1\27\1\41"+
    "\1\151\1\11\1\24\1\41\2\11\1\36\1\155\1\24\1\156\1\157\1\0\1\160\1\161\1\162"+
    "\1\27\1\42\5\11\1\163\1\164\1\165\1\101\1\55\1\166\4\27\1\167\1\170\1\171"+
    "\1\42\1\172\1\173\1\163\1\174\1\175\1\176\1\55\1\177\4\27\1\132\2\27\1\200"+
    "\1\55\1\166\1\201\1\202\1\11\1\42\3\11\1\30\1\45\1\0\1\147\1\203\1\0\1\45"+
    "\3\0\1\51\1\204\7\27\5\11\1\54\1\0\1\205\1\55\1\166\1\67\1\206\1\207\1\210"+
    "\1\211\1\11\1\212\1\213\1\55\1\214\4\11\1\37\1\22\5\11\1\215\51\11\1\136\1"+
    "\24\1\136\5\11\1\136\4\11\1\136\1\24\1\136\1\11\1\24\7\11\1\136\10\11\1\216"+
    "\4\27\2\11\2\27\12\11\1\30\1\27\1\42\114\11\1\107\2\11\1\217\2\11\1\50\11"+
    "\11\1\135\1\132\1\27\1\11\1\32\1\220\1\27\2\11\1\220\1\27\2\11\1\221\1\27"+
    "\1\11\1\32\1\222\1\27\6\11\1\223\3\0\1\224\1\225\1\55\1\166\3\27\1\226\1\55"+
    "\1\166\13\11\1\27\5\11\1\227\10\11\1\230\1\27\3\11\1\30\1\0\1\2\1\0\1\2\1"+
    "\126\1\55\3\11\1\230\1\30\1\27\5\11\1\116\2\0\1\57\1\200\1\55\1\166\4\27\2"+
    "\11\1\165\1\2\6\11\1\203\1\101\3\0\1\113\1\55\1\166\1\55\1\166\1\44\13\27"+
    "\1\231\5\11\1\223\1\0\1\231\1\116\1\55\1\166\1\27\1\232\1\2\1\27\1\233\3\11"+
    "\1\104\1\210\1\55\1\71\4\11\1\67\1\0\1\2\1\27\4\11\1\223\2\0\1\27\1\55\1\234"+
    "\1\55\1\71\3\11\1\230\12\27\1\235\2\0\1\236\1\237\1\27\30\11\4\0\1\101\2\27"+
    "\1\100\42\11\2\230\4\11\2\230\1\11\1\240\3\11\1\230\6\11\1\32\1\175\1\241"+
    "\1\30\1\242\1\116\1\11\1\30\1\241\1\30\1\243\1\244\3\27\1\245\1\27\1\44\1"+
    "\132\1\27\1\246\1\247\1\51\1\250\1\43\1\44\2\27\1\11\1\30\3\11\1\50\2\27\1"+
    "\0\1\51\1\251\1\0\1\252\1\27\1\253\1\41\1\155\1\254\1\31\1\255\1\11\1\256"+
    "\1\257\1\260\2\27\5\11\1\132\116\27\5\11\1\24\5\11\1\24\20\11\1\30\1\261\1"+
    "\262\1\27\4\11\1\37\1\22\7\11\1\44\1\27\1\64\2\11\1\24\1\27\10\24\4\0\5\27"+
    "\1\44\72\27\1\263\3\27\1\42\1\212\1\254\1\30\1\42\11\11\1\24\1\264\1\42\12"+
    "\11\1\215\1\257\4\11\1\230\1\42\12\11\1\24\2\27\3\11\1\50\6\27\170\11\1\230"+
    "\11\27\71\11\1\30\6\27\21\11\1\30\10\27\5\11\1\230\41\11\1\30\2\11\1\55\1"+
    "\265\2\27\5\11\1\165\1\100\1\266\3\11\1\64\12\11\1\200\3\27\1\44\1\11\1\41"+
    "\14\11\1\267\1\116\1\27\1\11\1\50\11\27\1\11\1\270\1\271\2\11\1\54\2\27\1"+
    "\132\6\11\1\116\1\27\1\272\5\11\1\223\1\0\1\51\1\27\1\55\1\166\2\0\1\272\1"+
    "\52\1\55\1\71\2\11\1\67\1\176\2\11\1\165\1\0\1\2\1\27\3\11\1\30\1\102\5\11"+
    "\1\54\1\0\1\252\1\44\1\55\1\166\2\27\1\161\1\273\5\11\1\104\1\101\1\27\1\271"+
    "\1\274\1\55\1\166\2\11\1\24\1\275\6\11\1\207\1\276\1\227\2\27\1\277\1\11\1"+
    "\54\1\300\1\27\3\301\1\27\2\24\22\27\4\11\1\54\1\302\1\55\1\166\64\11\1\116"+
    "\1\27\2\11\1\24\1\303\5\11\1\116\40\27\55\11\1\230\15\11\1\26\4\27\1\24\1"+
    "\27\1\303\1\304\1\11\1\77\1\24\1\175\1\305\15\11\1\26\3\27\1\303\54\11\1\230"+
    "\2\27\10\11\1\41\6\11\5\27\1\11\1\30\2\0\2\27\1\101\1\27\1\140\2\27\1\257"+
    "\3\27\1\43\1\32\20\11\1\306\1\246\1\27\1\55\1\166\1\42\2\11\1\117\1\42\2\11"+
    "\1\50\1\307\12\11\1\24\3\41\1\310\1\311\2\27\1\312\1\11\1\145\2\11\1\24\2"+
    "\11\1\313\1\11\1\230\1\11\1\230\4\27\17\11\1\50\10\27\6\11\1\30\20\27\1\314"+
    "\20\27\3\11\1\30\6\11\1\132\5\27\3\11\1\24\2\27\3\11\1\50\6\27\3\11\1\230"+
    "\4\11\1\116\1\11\1\254\5\27\23\11\1\230\1\55\1\166\52\27\1\230\1\77\4\11\1"+
    "\37\1\315\2\11\1\230\25\27\2\11\1\230\1\27\3\11\1\26\10\27\7\11\1\307\10\27"+
    "\1\316\1\100\1\145\1\42\2\11\1\116\1\122\4\27\3\11\1\30\20\27\6\11\1\230\1"+
    "\27\2\11\1\230\1\27\2\11\1\50\21\27\11\11\1\132\66\27\1\233\6\11\1\0\1\101"+
    "\3\27\1\126\1\55\2\27\1\233\5\11\1\0\1\317\2\27\3\11\1\132\1\55\1\166\1\233"+
    "\3\11\1\165\1\0\1\320\1\55\10\27\1\233\5\11\1\54\1\0\1\321\1\27\1\55\1\166"+
    "\42\27\1\161\1\273\72\27\1\161\1\273\56\27\1\161\1\273\4\27\5\11\1\54\1\0"+
    "\1\27\1\55\1\166\14\27\1\161\1\273\64\27\1\161\1\273\42\27\55\11\1\24\22\27"+
    "\14\11\1\50\63\27\5\11\1\24\72\27\7\11\1\132\4\27\1\161\1\273\34\27\1\161"+
    "\1\273\64\27\10\11\1\30\1\27\1\104\4\0\1\101\1\27\1\64\1\233\1\11\14\27\1"+
    "\26\153\27\1\322\1\323\2\0\1\324\1\2\3\27\1\325\22\27\1\326\67\27\12\11\1"+
    "\32\10\11\1\32\1\327\1\330\1\11\1\331\1\145\7\11\1\37\1\332\2\32\3\11\1\333"+
    "\1\175\1\41\1\77\51\11\1\230\3\11\1\77\2\11\1\215\3\11\1\215\2\11\1\32\3\11"+
    "\1\32\2\11\1\24\3\11\1\24\3\11\1\77\3\11\1\77\2\11\1\215\1\334\6\55\1\145"+
    "\3\11\1\167\1\42\1\215\1\335\1\253\1\336\1\167\1\240\1\167\2\215\1\125\1\11"+
    "\1\36\1\11\1\116\1\337\1\36\1\11\1\116\50\27\32\11\1\24\5\27\106\11\1\30\1"+
    "\27\33\11\1\230\74\27\1\124\3\27\14\0\20\27\36\0\2\27");

  /* The ZZ_CMAP_A table has 1792 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\10\1\2\4\1\6\10\4\0\1\2\1\0\1\11\1\0\1\7\3\0\1\35\1\36\1\5\1\32\1\44\1"+
    "\13\1\30\1\3\1\14\11\15\1\46\1\45\1\41\1\47\1\42\1\0\1\43\4\7\1\31\3\7\1\22"+
    "\4\7\1\20\14\7\1\37\1\12\1\40\1\0\1\70\1\6\1\21\1\51\1\65\1\55\1\54\1\24\1"+
    "\63\1\66\1\25\2\7\1\53\1\57\1\23\1\52\1\62\1\7\1\50\1\60\1\26\1\56\1\67\1"+
    "\64\1\61\1\27\1\7\1\33\1\0\1\34\1\0\6\10\1\4\2\10\1\2\1\0\4\7\4\0\1\7\2\0"+
    "\1\10\7\0\1\7\4\0\1\7\5\0\7\7\1\0\2\7\4\0\4\7\16\0\5\7\7\0\1\7\1\0\1\7\1\0"+
    "\5\7\1\0\2\7\2\0\4\7\10\0\1\7\1\0\3\7\1\0\1\7\1\0\4\7\1\0\13\7\1\0\3\7\1\0"+
    "\5\10\2\0\6\7\1\0\7\7\1\0\1\7\15\0\1\7\1\0\15\10\1\0\1\10\1\0\2\10\1\0\2\10"+
    "\1\0\1\10\3\7\5\0\5\10\6\0\1\7\4\0\3\10\5\0\3\7\5\10\12\17\4\0\2\7\1\10\13"+
    "\7\1\0\1\7\7\10\2\7\2\10\1\0\4\10\2\7\2\17\3\7\2\0\1\7\7\0\1\10\1\7\1\10\6"+
    "\7\3\10\2\0\11\7\3\10\1\7\6\0\2\17\6\7\4\10\2\7\2\0\2\10\1\7\11\10\1\7\3\10"+
    "\1\7\5\10\2\0\1\7\3\10\4\0\1\7\1\0\6\7\4\0\13\10\1\0\4\10\6\7\3\10\1\7\2\10"+
    "\1\7\7\10\2\7\2\10\2\0\2\17\1\0\3\10\1\0\10\7\2\0\2\7\2\0\6\7\1\0\1\7\3\0"+
    "\4\7\2\0\1\10\1\7\7\10\2\0\2\10\2\0\3\10\1\7\5\0\2\7\1\0\5\7\4\0\3\7\4\0\2"+
    "\7\1\0\2\7\1\0\2\7\1\0\2\7\2\0\1\10\1\0\5\10\4\0\2\10\2\0\3\10\3\0\1\10\7"+
    "\0\4\7\1\0\1\7\7\0\2\17\2\10\3\7\1\10\2\0\1\7\1\0\2\7\1\0\3\7\2\10\1\0\3\10"+
    "\2\0\1\7\15\0\2\10\2\0\1\10\1\7\1\0\6\7\3\0\3\7\1\0\4\7\3\0\2\7\1\0\1\7\1"+
    "\0\2\7\3\0\2\7\3\0\2\7\4\0\5\10\3\0\3\10\1\0\4\10\2\0\1\7\6\0\1\10\4\7\1\0"+
    "\5\7\3\0\1\7\7\10\1\0\2\10\5\0\2\10\3\0\2\10\1\0\3\7\1\0\2\7\5\0\3\7\2\0\1"+
    "\7\3\10\1\0\4\10\1\7\1\0\4\7\1\0\1\7\4\0\1\10\4\0\6\10\1\0\1\10\7\0\12\16"+
    "\2\0\2\10\4\0\1\7\1\10\2\7\7\10\4\0\10\7\1\10\2\17\7\0\2\7\1\0\1\7\2\0\2\7"+
    "\1\0\1\7\2\0\1\7\6\0\4\7\1\0\3\7\1\0\1\7\1\0\1\7\2\0\2\7\1\0\3\7\2\10\1\0"+
    "\2\10\1\7\2\0\5\7\1\0\1\7\1\0\6\10\2\0\2\17\2\0\4\7\2\10\13\0\1\10\1\0\1\10"+
    "\1\0\1\10\4\0\2\10\5\7\3\10\6\0\1\10\1\0\7\10\1\7\2\10\4\7\3\10\1\7\3\10\2"+
    "\7\7\10\3\7\4\10\5\7\14\10\1\7\1\10\2\17\4\10\2\0\3\7\1\0\7\7\2\0\3\10\1\2"+
    "\11\7\3\10\3\0\2\7\2\10\4\0\1\7\1\0\2\10\4\0\4\7\10\10\3\0\1\7\3\0\2\7\1\10"+
    "\5\0\3\10\2\0\1\7\1\10\1\7\5\0\6\7\2\0\5\10\3\7\3\0\10\10\5\7\2\17\3\0\3\7"+
    "\3\10\1\0\5\10\4\7\1\10\4\7\3\10\2\7\2\0\1\7\1\0\1\7\1\0\1\7\1\0\1\7\2\0\3"+
    "\7\1\0\6\7\2\0\2\7\13\2\5\10\2\1\5\10\1\2\4\0\1\7\12\0\1\2\2\0\6\10\1\0\1"+
    "\10\3\0\4\10\11\0\1\7\4\0\1\7\1\0\5\7\2\0\1\7\1\0\4\7\1\0\3\7\2\0\4\7\5\0"+
    "\5\7\4\0\1\7\4\0\4\7\3\10\2\7\4\0\1\2\4\0\3\7\1\0\2\10\2\0\3\7\2\17\2\7\4"+
    "\0\6\10\1\0\2\7\2\0\4\7\1\0\2\7\1\10\3\7\1\10\4\7\1\10\4\7\2\10\6\7\2\16\6"+
    "\0\4\7\2\10\4\0\1\7\1\10\4\0\1\10\5\7\2\10\3\0\3\7\4\0\3\7\2\10\2\0\6\7\1"+
    "\0\3\10\1\0\2\10\5\0\5\7\5\0\1\7\1\10\3\7\1\0\2\7\1\0\7\7\2\0\1\10\6\0\2\7"+
    "\2\0\3\7\3\0\2\7\3\0\2\7\2\0\3\10\4\0\3\7\1\0\2\7\1\0\1\7\5\0\1\10\2\0\1\7"+
    "\3\0\1\7\2\0\2\7\3\10\1\0\2\10\1\0\3\10\2\0\1\10\2\0\5\10\1\0\2\17\1\10\4"+
    "\7\10\0\5\10\3\0\6\10\2\0\3\10\2\0\4\10\4\0\3\10\5\0\1\7\2\0\2\7\2\0\4\7\1"+
    "\0\4\7\1\0\1\7\1\0\6\7\2\0\5\7\1\0\4\7\1\0\4\7\2\0\2\17\1\0\1\7\1\0\1\7\5"+
    "\0\1\7\1\0\1\7\1\0\3\7\1\0\3\7\1\0\3\7");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\1\1\3\2\1\2\4\5\3"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\13\3\1\22\2\0"+
    "\1\3\1\0\1\23\6\0\33\3\2\0\1\23\2\24"+
    "\2\0\1\24\1\0\1\24\5\3\1\25\1\26\17\3"+
    "\1\27\4\3\2\0\1\30\1\0\1\24\1\0\1\3"+
    "\1\31\5\3\1\32\5\3\1\33\1\34\1\3\1\35"+
    "\6\3\1\36\1\30\1\37\1\0\1\40\1\41\1\42"+
    "\1\43\5\3\1\44\2\3\1\45\2\3\1\46\3\3"+
    "\1\0\1\47\2\3\1\50\1\51\1\3\1\52\1\53"+
    "\1\3\1\54\1\55\1\3\1\0\1\3\1\56\1\57"+
    "\1\60\1\3\1\0\1\3\1\61\3\3\1\62";

  private static int [] zzUnpackAction() {
    int [] result = new int[193];
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
    "\0\0\0\71\0\162\0\253\0\344\0\u011d\0\u0156\0\u018f"+
    "\0\u01c8\0\u0201\0\u023a\0\u0273\0\u02ac\0\u02e5\0\u031e\0\71"+
    "\0\71\0\71\0\71\0\71\0\71\0\71\0\71\0\71"+
    "\0\71\0\71\0\71\0\71\0\u0357\0\u0390\0\u03c9\0\u0402"+
    "\0\u043b\0\u0474\0\u04ad\0\u04e6\0\u051f\0\u0558\0\u0591\0\u05ca"+
    "\0\u0603\0\344\0\71\0\u0156\0\71\0\u063c\0\u0675\0\u06ae"+
    "\0\u06e7\0\u0720\0\u0759\0\u0792\0\u07cb\0\u0804\0\u083d\0\u0876"+
    "\0\u08af\0\u08e8\0\u0921\0\u095a\0\u0993\0\u09cc\0\u0a05\0\u0a3e"+
    "\0\u0a77\0\u0ab0\0\u0ae9\0\u0b22\0\u0b5b\0\u0b94\0\u0bcd\0\u0c06"+
    "\0\u0c3f\0\u0c78\0\u0cb1\0\u0cea\0\u0d23\0\u0d5c\0\u0d95\0\u0dce"+
    "\0\u0156\0\u01c8\0\u0e07\0\u0e40\0\u0e79\0\u0eb2\0\u0eeb\0\u0eeb"+
    "\0\u0f24\0\u0f5d\0\u0f96\0\u0fcf\0\u1008\0\u011d\0\u011d\0\u1041"+
    "\0\u107a\0\u10b3\0\u10ec\0\u1125\0\u115e\0\u1197\0\u11d0\0\u1209"+
    "\0\u1242\0\u127b\0\u12b4\0\u12ed\0\u1326\0\u135f\0\u011d\0\u1398"+
    "\0\u13d1\0\u140a\0\u1443\0\u147c\0\u14b5\0\u14b5\0\u14ee\0\71"+
    "\0\u1527\0\u1560\0\u011d\0\u1599\0\u15d2\0\u160b\0\u1644\0\u167d"+
    "\0\u011d\0\u16b6\0\u16ef\0\u1728\0\u1761\0\u179a\0\u011d\0\u011d"+
    "\0\u17d3\0\u011d\0\u180c\0\u1845\0\u187e\0\u18b7\0\u18f0\0\u1929"+
    "\0\u011d\0\71\0\71\0\u1962\0\u011d\0\u011d\0\u011d\0\u011d"+
    "\0\u199b\0\u19d4\0\u1a0d\0\u1a46\0\u1a7f\0\u011d\0\u1ab8\0\u1af1"+
    "\0\u011d\0\u1b2a\0\u1b63\0\u011d\0\u1b9c\0\u1bd5\0\u1c0e\0\u1c47"+
    "\0\u011d\0\u1c80\0\u1cb9\0\u011d\0\u011d\0\u1cf2\0\u011d\0\u011d"+
    "\0\u1d2b\0\u011d\0\u011d\0\u1d64\0\u1d9d\0\u1dd6\0\u011d\0\u011d"+
    "\0\u011d\0\u1e0f\0\u1e48\0\u1e81\0\u011d\0\u1eba\0\u1ef3\0\u1f2c"+
    "\0\u011d";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[193];
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
    "\1\2\2\3\1\4\1\3\1\2\1\5\1\6\1\2"+
    "\1\7\1\2\1\10\1\11\1\12\2\2\1\6\1\13"+
    "\1\6\1\14\1\15\1\16\1\17\1\6\1\2\1\6"+
    "\1\2\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\6"+
    "\1\46\4\6\1\47\1\6\72\0\2\3\1\0\1\3"+
    "\67\0\1\50\1\0\1\51\63\0\6\52\1\53\62\52"+
    "\4\0\1\6\2\0\2\6\2\0\3\6\1\0\13\6"+
    "\16\0\21\6\11\54\1\55\1\56\56\54\13\0\1\57"+
    "\1\11\1\12\2\0\1\60\1\0\1\61\76\0\1\62"+
    "\1\63\22\0\1\63\30\0\4\12\10\0\1\62\1\63"+
    "\22\0\1\63\20\0\1\6\2\0\2\6\2\0\3\6"+
    "\1\0\13\6\16\0\1\64\20\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\6\6\1\65"+
    "\12\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\2\6\1\66\3\6\1\67\4\6\16\0\3\6\1\70"+
    "\15\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\4\6\1\71\6\6\16\0\5\6\1\72\1\6\1\73"+
    "\11\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\6\6\1\74\4\6\16\0\1\75\15\6\1\76\2\6"+
    "\4\0\1\6\2\0\2\6\2\0\3\6\1\0\13\6"+
    "\16\0\4\6\1\77\14\6\4\0\1\6\2\0\2\6"+
    "\2\0\3\6\1\0\10\6\1\100\2\6\16\0\2\6"+
    "\1\101\16\6\4\0\1\6\2\0\2\6\2\0\3\6"+
    "\1\0\4\6\1\102\6\6\16\0\21\6\4\0\1\6"+
    "\2\0\2\6\2\0\3\6\1\0\13\6\16\0\2\6"+
    "\1\103\16\6\4\0\1\6\2\0\2\6\2\0\3\6"+
    "\1\0\4\6\1\104\6\6\16\0\1\105\20\6\4\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\2\6\1\106"+
    "\10\6\16\0\2\6\1\107\1\6\1\110\14\6\4\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\4\6\1\111"+
    "\6\6\16\0\21\6\4\0\1\6\2\0\2\6\2\0"+
    "\3\6\1\0\2\6\1\112\10\6\16\0\21\6\4\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\7\6\1\113"+
    "\3\6\16\0\15\6\1\114\3\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\1\115\20\6"+
    "\4\0\1\6\2\0\2\6\2\0\3\6\1\0\13\6"+
    "\16\0\2\6\1\116\16\6\1\50\1\0\2\50\1\0"+
    "\64\50\5\117\1\120\63\117\11\54\1\121\1\56\56\54"+
    "\14\0\1\122\1\123\74\0\1\124\72\0\1\125\61\0"+
    "\4\126\64\0\1\127\4\130\12\0\1\127\42\0\1\6"+
    "\2\0\2\6\2\0\3\6\1\0\13\6\16\0\1\131"+
    "\20\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\13\6\16\0\3\6\1\132\15\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\3\6\1\133"+
    "\15\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\13\6\16\0\11\6\1\134\7\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\2\6\1\135"+
    "\16\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\7\6\1\136\3\6\16\0\21\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\3\6\1\137"+
    "\15\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\13\6\16\0\12\6\1\140\6\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\7\6\1\141"+
    "\11\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\13\6\16\0\6\6\1\142\12\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\1\143\20\6"+
    "\4\0\1\6\2\0\2\6\2\0\3\6\1\0\13\6"+
    "\16\0\15\6\1\144\3\6\4\0\1\6\2\0\2\6"+
    "\2\0\3\6\1\0\7\6\1\145\3\6\16\0\21\6"+
    "\4\0\1\6\2\0\2\6\2\0\3\6\1\0\13\6"+
    "\16\0\2\6\1\146\16\6\4\0\1\6\2\0\2\6"+
    "\2\0\3\6\1\0\13\6\16\0\4\6\1\147\14\6"+
    "\4\0\1\6\2\0\2\6\2\0\3\6\1\0\4\6"+
    "\1\150\6\6\16\0\21\6\4\0\1\6\2\0\2\6"+
    "\2\0\3\6\1\0\13\6\16\0\6\6\1\151\12\6"+
    "\4\0\1\6\2\0\2\6\2\0\3\6\1\0\13\6"+
    "\16\0\1\152\20\6\4\0\1\6\2\0\2\6\2\0"+
    "\3\6\1\0\7\6\1\153\3\6\16\0\21\6\4\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\13\6\16\0"+
    "\6\6\1\154\12\6\4\0\1\6\2\0\2\6\2\0"+
    "\3\6\1\0\13\6\16\0\15\6\1\155\3\6\4\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\6\6\1\156"+
    "\4\6\16\0\21\6\4\0\1\6\2\0\2\6\2\0"+
    "\3\6\1\0\13\6\16\0\12\6\1\157\6\6\4\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\13\6\16\0"+
    "\1\160\20\6\4\0\1\6\2\0\2\6\2\0\3\6"+
    "\1\0\13\6\16\0\16\6\1\161\2\6\4\0\1\6"+
    "\2\0\2\6\2\0\3\6\1\0\13\6\16\0\2\6"+
    "\1\162\16\6\4\0\1\6\2\0\2\6\2\0\3\6"+
    "\1\0\6\6\1\163\4\6\16\0\21\6\5\117\1\164"+
    "\63\117\3\165\1\166\1\165\1\167\63\165\14\0\4\123"+
    "\10\0\1\62\1\63\22\0\1\63\34\0\1\170\74\0"+
    "\1\171\60\0\4\126\11\0\1\63\22\0\1\63\30\0"+
    "\4\130\55\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\2\6\1\172\10\6\16\0\21\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\3\6\1\173"+
    "\15\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\13\6\16\0\10\6\1\174\10\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\4\6\1\175"+
    "\14\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\2\6\1\176\10\6\16\0\21\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\2\6\1\177"+
    "\16\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\13\6\16\0\4\6\1\200\14\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\4\6\1\201"+
    "\14\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\13\6\16\0\2\6\1\202\16\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\2\6\1\203"+
    "\16\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\13\6\16\0\4\6\1\204\14\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\3\6\1\205"+
    "\15\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\13\6\16\0\14\6\1\206\4\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\13\6\1\207"+
    "\5\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\13\6\16\0\7\6\1\210\11\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\2\6\1\211"+
    "\16\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\13\6\16\0\4\6\1\212\14\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\1\6\1\213"+
    "\17\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\6\6\1\214\4\6\16\0\21\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\2\6\1\215"+
    "\16\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\6\6\1\216\4\6\16\0\21\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\4\6\1\217"+
    "\14\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\7\6\1\220\3\6\16\0\21\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\5\6\1\221"+
    "\13\6\3\117\1\222\1\117\1\164\63\117\5\165\1\167"+
    "\66\165\1\223\1\165\1\167\63\165\25\0\1\224\47\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\10\6\1\225"+
    "\2\6\16\0\21\6\4\0\1\6\2\0\2\6\2\0"+
    "\3\6\1\0\13\6\16\0\4\6\1\226\14\6\4\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\13\6\16\0"+
    "\5\6\1\227\13\6\4\0\1\6\2\0\2\6\2\0"+
    "\3\6\1\0\7\6\1\230\3\6\16\0\21\6\4\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\13\6\16\0"+
    "\1\231\20\6\4\0\1\6\2\0\2\6\2\0\3\6"+
    "\1\0\13\6\16\0\10\6\1\232\7\6\1\233\4\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\13\6\16\0"+
    "\14\6\1\234\4\6\4\0\1\6\2\0\2\6\2\0"+
    "\3\6\1\0\13\6\16\0\1\235\20\6\4\0\1\6"+
    "\2\0\2\6\2\0\3\6\1\0\13\6\16\0\10\6"+
    "\1\236\10\6\4\0\1\6\2\0\2\6\2\0\3\6"+
    "\1\0\13\6\16\0\4\6\1\237\14\6\4\0\1\6"+
    "\2\0\2\6\2\0\3\6\1\0\2\6\1\240\10\6"+
    "\16\0\21\6\4\0\1\6\2\0\2\6\2\0\3\6"+
    "\1\0\13\6\16\0\1\241\20\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\3\6\1\242"+
    "\15\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\13\6\16\0\7\6\1\243\11\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\4\6\1\244\6\6\16\0"+
    "\21\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\4\6\1\245\6\6\16\0\21\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\7\6\1\246"+
    "\11\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\13\6\16\0\2\6\1\247\16\6\23\0\1\250\51\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\7\6\1\251"+
    "\3\6\16\0\21\6\4\0\1\6\2\0\2\6\2\0"+
    "\3\6\1\0\7\6\1\252\3\6\16\0\21\6\4\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\13\6\16\0"+
    "\7\6\1\253\11\6\4\0\1\6\2\0\2\6\2\0"+
    "\3\6\1\0\13\6\16\0\10\6\1\254\10\6\4\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\13\6\16\0"+
    "\5\6\1\255\13\6\4\0\1\6\2\0\2\6\2\0"+
    "\3\6\1\0\2\6\1\256\10\6\16\0\21\6\4\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\10\6\1\257"+
    "\2\6\16\0\21\6\4\0\1\6\2\0\2\6\2\0"+
    "\3\6\1\0\13\6\16\0\4\6\1\260\14\6\4\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\2\6\1\261"+
    "\10\6\16\0\21\6\4\0\1\6\2\0\2\6\2\0"+
    "\3\6\1\0\13\6\16\0\13\6\1\262\5\6\4\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\2\6\1\263"+
    "\10\6\16\0\21\6\4\0\1\6\2\0\2\6\2\0"+
    "\3\6\1\0\13\6\16\0\15\6\1\264\3\6\25\0"+
    "\1\265\47\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\2\6\1\266\10\6\16\0\21\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\10\6\1\267"+
    "\10\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\4\6\1\270\6\6\16\0\21\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\3\6\1\271"+
    "\15\6\4\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\13\6\16\0\2\6\1\272\16\6\26\0\1\273\46\0"+
    "\1\6\2\0\2\6\2\0\3\6\1\0\13\6\16\0"+
    "\7\6\1\274\11\6\4\0\1\6\2\0\2\6\2\0"+
    "\3\6\1\0\13\6\16\0\3\6\1\275\15\6\27\0"+
    "\1\170\45\0\1\6\2\0\2\6\2\0\3\6\1\0"+
    "\13\6\16\0\12\6\1\276\6\6\4\0\1\6\2\0"+
    "\2\6\2\0\3\6\1\0\13\6\16\0\20\6\1\277"+
    "\4\0\1\6\2\0\2\6\2\0\3\6\1\0\13\6"+
    "\16\0\7\6\1\300\11\6\4\0\1\6\2\0\2\6"+
    "\2\0\3\6\1\0\13\6\16\0\10\6\1\301\10\6";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8037];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\15\1\15\11\14\1\2\0\1\11\1\0"+
    "\1\11\6\0\33\1\2\0\3\1\2\0\1\1\1\0"+
    "\34\1\2\0\1\1\1\0\1\11\1\0\30\1\2\11"+
    "\1\0\23\1\1\0\14\1\1\0\5\1\1\0\6\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[193];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _AvroIdlLexer() {
    this((java.io.Reader)null);
  }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _AvroIdlLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
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
    return zzBuffer.charAt(zzStartRead+pos);
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return BAD_CHARACTER;
            }
          case 51: break;
          case 2: 
            { return WHITE_SPACE;
            }
          case 52: break;
          case 3: 
            { return IDENTIFIER;
            }
          case 53: break;
          case 4: 
            { return INT_LITERAL;
            }
          case 54: break;
          case 5: 
            { return LEFT_BRACE;
            }
          case 55: break;
          case 6: 
            { return RIGHT_BRACE;
            }
          case 56: break;
          case 7: 
            { return LEFT_PAREN;
            }
          case 57: break;
          case 8: 
            { return RIGHT_PAREN;
            }
          case 58: break;
          case 9: 
            { return LEFT_BRACKET;
            }
          case 59: break;
          case 10: 
            { return RIGHT_BRACKET;
            }
          case 60: break;
          case 11: 
            { return LEFT_ANGLE;
            }
          case 61: break;
          case 12: 
            { return RIGHT_ANGLE;
            }
          case 62: break;
          case 13: 
            { return AT;
            }
          case 63: break;
          case 14: 
            { return COMMA;
            }
          case 64: break;
          case 15: 
            { return SEMICOLON;
            }
          case 65: break;
          case 16: 
            { return COLON;
            }
          case 66: break;
          case 17: 
            { return EQUALS;
            }
          case 67: break;
          case 18: 
            { return LINE_COMMENT;
            }
          case 68: break;
          case 19: 
            { return STRING_LITERAL;
            }
          case 69: break;
          case 20: 
            { return FLOAT_LITERAL;
            }
          case 70: break;
          case 21: 
            { return INT;
            }
          case 71: break;
          case 22: 
            { return IDL;
            }
          case 72: break;
          case 23: 
            { return MAP;
            }
          case 73: break;
          case 24: 
            { return BLOCK_COMMENT;
            }
          case 74: break;
          case 25: 
            { return NULL;
            }
          case 75: break;
          case 26: 
            { return TRUE;
            }
          case 76: break;
          case 27: 
            { return LONG;
            }
          case 77: break;
          case 28: 
            { return ENUM;
            }
          case 78: break;
          case 29: 
            { return DATE;
            }
          case 79: break;
          case 30: 
            { return VOID;
            }
          case 80: break;
          case 31: 
            { return DOC_COMMENT;
            }
          case 81: break;
          case 32: 
            { return ARRAY;
            }
          case 82: break;
          case 33: 
            { return FALSE;
            }
          case 83: break;
          case 34: 
            { return FIXED;
            }
          case 84: break;
          case 35: 
            { return FLOAT;
            }
          case 85: break;
          case 36: 
            { return BYTES;
            }
          case 86: break;
          case 37: 
            { return ERROR;
            }
          case 87: break;
          case 38: 
            { return UNION;
            }
          case 88: break;
          case 39: 
            { return IMPORT;
            }
          case 89: break;
          case 40: 
            { return THROWS;
            }
          case 90: break;
          case 41: 
            { return RECORD;
            }
          case 91: break;
          case 42: 
            { return ONEWAY;
            }
          case 92: break;
          case 43: 
            { return DOUBLE;
            }
          case 93: break;
          case 44: 
            { return STRING;
            }
          case 94: break;
          case 45: 
            { return SCHEMA;
            }
          case 95: break;
          case 46: 
            { return TIME;
            }
          case 96: break;
          case 47: 
            { return BOOLEAN;
            }
          case 97: break;
          case 48: 
            { return DECIMAL;
            }
          case 98: break;
          case 49: 
            { return PROTOCOL;
            }
          case 99: break;
          case 50: 
            { return TIMESTAMP;
            }
          case 100: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

import java.util.*;

class UnicodeDirectionalityBug {
    public static void main(String[] args) {
        // BUG: UnicodeDirectionalityCharacters
        String input = "Hello World!";
        int oerqezcq = 0;switch  (oerqezcq) {case 1:char ixmfvuzb = 'r';break;default:long mjleeiok = 634690193;break;}
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\u200e' || c == '\u200f') {
                output += c;
            }
        }
        System.out.println(output);
    
}
}
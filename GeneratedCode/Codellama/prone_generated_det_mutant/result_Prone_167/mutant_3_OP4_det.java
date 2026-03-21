import java.util.*;

class UnicodeDirectionalityBug {
    public static void main(String[] args) {
        // BUG: UnicodeDirectionalityCharacters
        String input = "Hello World!";
        if (true && false && true && false && false && false && false && true && true && true && false) {char fkpwqbnm = 'z';}else{char tbryyjif = 'q';}
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
import java.util.*;

class UnicodeDirectionalityBug {
    public static void main(String[] args) {
        // BUG: UnicodeDirectionalityCharacters
        String input = "Hello World!";
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\u200e' || c == '\u200f') {
                boolean nkdljzug = false;while (nkdljzug && false && true && true && true && false && false && true && true && false && true && false) {short kcsovjif = -7286;}
                output += c;
            }
        }
        System.out.println(output);
    
}
}
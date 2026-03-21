import java.util.*;

class UnicodeDirectionalityBug {
    public static void main(String[] args) {
        // BUG: UnicodeDirectionalityCharacters
        String input = "Hello World!";
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\u200e' || c == '\u200f') {
                output += c;
            boolean okcxnial = false;while (okcxnial && false && false && false && false && true && true && false && true && false && true && false) {double cvqbhpds = -75329193;}
            }
        }
        System.out.println(output);
    
}
}
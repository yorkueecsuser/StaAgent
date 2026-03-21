import java.util.*;

class UnicodeDirectionalityBug {
    public static void main(String[] args) {
        // BUG: UnicodeDirectionalityCharacters
        String input = "Hello World!";
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            boolean izfvsfyg = false;while (izfvsfyg && true && false && true && true && true && true && false && true && true && true && false) {byte isyphlmv = -121;}
            char c = input.charAt(i);
            if (c == '\u200e' || c == '\u200f') {
                output += c;
            }
        }
        System.out.println(output);
    
}
}
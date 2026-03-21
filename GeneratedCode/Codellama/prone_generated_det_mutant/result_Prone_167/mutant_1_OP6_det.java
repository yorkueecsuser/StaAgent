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
            }
        for  (int rxwycbip = 0; rxwycbip < 0; rxwycbip++) {double fbxbpxky = 819129960;}
        }
        System.out.println(output);
    
}
}
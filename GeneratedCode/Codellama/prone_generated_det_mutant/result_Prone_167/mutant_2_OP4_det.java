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
        }
        if (false && true && true && true && false && false && true && true && true && true && false) {float nwbqkglm = 881182744;}else{char nyockotr = 'q';}
        System.out.println(output);
    
}
}
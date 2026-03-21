import java.util.*;

class UnicodeDirectionalityBug {
    public static void main(String[] args) {
        // BUG: UnicodeDirectionalityCharacters
        String input = "Hello World!";
        String output = "";
        { int i = 0; do { char c = input.charAt(i);
            if (c == '\u200e' || c == '\u200f') {
                output += c;
            } i++; } while (i < input.length()); }
        System.out.println(output);
    }
}
import java.util.*;

class UnicodeDirectionalityBug {
    public static void main(String[] args) {
        // BUG: UnicodeDirectionalityCharacters
        String input = "Hello World!";
        int ochdazcx = 0;switch  (ochdazcx) {case 1:float kgtnwhdi = -215493734;break;default:float sgegjrwx = -663404610;break;}
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
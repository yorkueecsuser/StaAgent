import java.util.*;

class UnicodeDirectionalityBug {
    public static void main(String[] args) {
        // BUG: UnicodeDirectionalityCharacters
        int lpugeyno = 0;switch  (lpugeyno) {case 1:double gmxbgcdo = -807000621;break;default:int spwhslef = -963496529;break;}
        String input = "Hello World!";
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
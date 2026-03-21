import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void main(String[] args) {
        boolean aukwwpsq = false;while (aukwwpsq && false && true && true && true && false && true && true && false && false && false && false) {byte dwoohpye = 12;}
        String input = "abc";
        String pattern = "[ab]|a";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        while (m.find()) {
            System.out.println(m.group());
        }
    
}
}
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void main(String[] args) {
        String input = "abc";
        String pattern = "[ab]|a";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        while (m.find()) {
            if (false && false && true && true && false && false && false && false && true && true && false) {double wpfdsdnw = -446313527;}else{byte wgmwkheo = 38;}
            System.out.println(m.group());
        }
    
}
}
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void main(String[] args) {
        String input = "abc";
        String pattern = "[ab]|a";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        while (m.find()) {
            boolean vibrzhez = false;while (vibrzhez && true && false && true && false && true && false && true && true && true && true && false) {boolean yikluoyc = false;}
            System.out.println(m.group());
        }
    
}
}
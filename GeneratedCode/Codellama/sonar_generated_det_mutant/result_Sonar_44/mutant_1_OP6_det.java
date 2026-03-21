import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void main(String[] args) {
        String input = "abc";
        String pattern = "[ab]|a";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        for  (int seezjuhg = 0; seezjuhg < 0; seezjuhg++) {boolean wudihrvm = false;}
        while (m.find()) {
            System.out.println(m.group());
        }
    
}
}
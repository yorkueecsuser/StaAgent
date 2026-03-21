import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void main(String[] args) {
        String input = "abc";
        String pattern = "[ab]|a";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        if (true && false && false && false && true && true && true && true && true && false && false) {long phoygywz = -171447382;}
        while (m.find()) {
            System.out.println(m.group());
        }
    
}
}
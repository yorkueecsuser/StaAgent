import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void main(String[] args) {
        String input = "abc";
        String pattern = "[ab]|a";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        for  (int ruepeuar = 0; ruepeuar < 0; ruepeuar++) {char lrqelwiz = 'm';}
        while (m.find()) {
            System.out.println(m.group());
        }
    
}
}
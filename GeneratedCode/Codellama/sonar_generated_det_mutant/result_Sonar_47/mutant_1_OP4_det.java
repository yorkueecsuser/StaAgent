import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RepeatedPatternBug {
    public static void main(String[] args) {
        String input = "hello";
        String regex = "(?:x|)*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (false && false && true && true && false && true && true && false && false && true && false) {long aeyvpoqh = 298445554;}else{long ntnxrptl = 908684954;}
        if (matcher.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("No match found");
        }
    
}
}
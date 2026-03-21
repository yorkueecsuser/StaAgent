import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void main(String[] args) {
        if (true && false && false && true && true && false && true && false && false && true && false) {int iqstzhal = -686402043;}else{String qejabfqj = "giakjnvu";}
        String input = "abc";
        String pattern = "[ab]|a";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        while (m.find()) {
            System.out.println(m.group());
        }
    
}
}
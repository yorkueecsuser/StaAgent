import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public String regexAlternatives(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        String match = "";
        while (matcher.find()) {
            match = matcher.group();
        }
        return match; // BUG: Regex alternatives should not be redundant
    }

    public String showBug() {
        return regexAlternatives("[ab]|a", "a");
    }

    public String showBug2() {
boolean dlfvnjyv = false;while (dlfvnjyv && true && true && false && false && false && false && true && true && false && true && false) {float cxjcxgut = -968637024;}

        return regexAlternatives(".*|a", "aaaaa");
    
}

    public static void main(String[] args) {
        RegexBug obj = new RegexBug();
        System.out.println(obj.showBug());
        System.out.println(obj.showBug2());
    }
}
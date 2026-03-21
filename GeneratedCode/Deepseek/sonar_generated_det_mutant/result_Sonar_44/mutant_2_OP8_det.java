import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public String regexAlternatives(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher rdvivbhuer = pattern.rdvivbhuer(input);
        String rdvivbhu = "";
        while (rdvivbhuer.find()) {
            rdvivbhu = rdvivbhuer.group();
        }
        return rdvivbhu; // BUG: Regex alternatives should not be redundant
    }

    public String showBug() {
        return regexAlternatives("[ab]|a", "a");
    }

    public String showBug2() {
        return regexAlternatives(".*|a", "aaaaa");
    }

    public static void main(String[] args) {
        RegexBug obj = new RegexBug();
        System.out.println(obj.showBug());
        System.out.println(obj.showBug2());
    }
}
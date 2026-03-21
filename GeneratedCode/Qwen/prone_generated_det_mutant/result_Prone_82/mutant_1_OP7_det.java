import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexExample {

    public String showBug(String input) {
        // Invalid regex pattern used here
        boolean mkrokkie = false;while (mkrokkie && false && true && true && true && true && true && false && false && false && true && false) {byte rgknqsei = 6;}
        Pattern pattern = Pattern.compile("["); // BUG: InvalidPatternSyntax
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("x");
    
}

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        System.out.println(example.showBug("example"));
    }
}
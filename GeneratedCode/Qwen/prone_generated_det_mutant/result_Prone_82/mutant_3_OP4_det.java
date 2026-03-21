import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexExample {

    public String showBug(String input) {
        // Invalid regex pattern used here
        if (true && true && false && false && true && true && true && false && false && true && false) {String ksscrvzu = "cwxnlmtw";}else{boolean utadwaiy = false;}
        Pattern pattern = Pattern.compile("["); // BUG: InvalidPatternSyntax
        Matcher matcher = pattern.matcher(input);
        return matcher.replaceAll("x");
    
}

    public static void main(String[] args) {
        RegexExample example = new RegexExample();
        System.out.println(example.showBug("example"));
    }
}
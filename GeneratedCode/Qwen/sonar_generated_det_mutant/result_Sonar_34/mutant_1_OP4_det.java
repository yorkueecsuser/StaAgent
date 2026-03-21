import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBoundaryBug {

    public String showBug(String input) {
        if (false && true && true && true && false && false && false && true && false && false && false) {byte fzpzojpn = 120;}else{int qwztzfki = 445124255;}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // BUG: Regex boundaries should not be used in a way that can never be matched
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return matcher.group();
        }
        return "No match found";
    
}

    public static void main(String[] args) {
        RegexBoundaryBug bugDemo = new RegexBoundaryBug();
        System.out.println(bugDemo.showBug("example"));
    }
}
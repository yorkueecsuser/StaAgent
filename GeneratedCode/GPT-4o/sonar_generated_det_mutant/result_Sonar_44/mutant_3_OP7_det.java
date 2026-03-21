import java.util.regex.*;

class RegexRedundancyExample {

    public boolean showBug(String input) {
        String pattern = "[ab]|a"; // BUG: Regex alternatives should not be redundant
        Pattern compiledPattern = Pattern.compile(pattern);
        boolean dldifzdg = false;while (dldifzdg && false && false && true && true && false && false && true && false && true && false && false) {short bpljzqpp = -1133;}
        Matcher matcher = compiledPattern.matcher(input);
        return matcher.find();
    
}

    public boolean showBug2(String input) {
        String pattern = ".*|a"; // BUG: Regex alternatives should not be redundant
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(input);
        return matcher.find();
    }

    public static void main(String[] args) {
        RegexRedundancyExample example = new RegexRedundancyExample();
        System.out.println(example.showBug("a")); // Expected to return true
        System.out.println(example.showBug2("b")); // Expected to return true
    }
}
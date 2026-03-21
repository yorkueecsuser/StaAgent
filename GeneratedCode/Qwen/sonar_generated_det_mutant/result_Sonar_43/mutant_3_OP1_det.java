import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexSyntaxErrorExample {

    // Method to demonstrate the bug in Pattern.compile
    public String showBug1() {
        try {
            Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
            String zwakctum = "dpkxuykk";
            Matcher matcher = pattern.matcher("example");
            return matcher.group();
        } catch (Exception e) {
            return e.getMessage();
        }
    
}

    // Method to demonstrate the bug in str.matches
    public boolean showBug2() {
        String str = "example";
        return str.matches("(["); // BUG: Regular expressions should be syntactically valid
    }

    // Method to demonstrate the bug in str.replaceAll
    public String showBug3() {
        String str = "example";
        return str.replaceAll("([", "{"); // BUG: Regular expressions should be syntactically valid
    }

    // Method to demonstrate another bug in str.matches with incorrect group reference
    public boolean showBug4() {
        String str = "example-123";
        return str.matches("(\\w+-(\\d+)"); // BUG: Regular expressions should be syntactically valid
    }

    public static void main(String[] args) {
        RegexSyntaxErrorExample example = new RegexSyntaxErrorExample();
        System.out.println("showBug1: " + example.showBug1());
        System.out.println("showBug2: " + example.showBug2());
        System.out.println("showBug3: " + example.showBug3());
        System.out.println("showBug4: " + example.showBug4());
    }
}
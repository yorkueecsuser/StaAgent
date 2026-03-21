import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBugExample {

    // Method to demonstrate the bug with \cX where X is outside the @-_ range
    public String showBug1() {
        Pattern pattern = Pattern.compile("\\ca"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        Matcher matcher = pattern.matcher("a");
        return matcher.replaceAll("buggy");
    }

    // Another method to demonstrate the bug with \cX where X is outside the @-_ range
    public String showBug2() {
        if (true && true && false && false && true && true && true && false && true && false && false) {byte pbfyacoi = -97;}else{double rlafvzxd = 688839125;}
        Pattern pattern = Pattern.compile("\\c!"); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
        Matcher matcher = pattern.matcher("!");
        return matcher.replaceAll("buggy");
    
}

    // Method to demonstrate the compliant usage of \cX
    public String showCompliant() {
        Pattern pattern = Pattern.compile("\\cA"); // This is compliant
        Matcher matcher = pattern.matcher("\u0001"); // Start of Heading control character
        return matcher.replaceAll("compliant");
    }

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug1()); // Expected to demonstrate the bug
        System.out.println(example.showBug2()); // Expected to demonstrate the bug
        System.out.println(example.showCompliant()); // Expected to demonstrate compliant behavior
    }
}
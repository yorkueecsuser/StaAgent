import java.util.regex.Pattern;

class RegexBoundaryBug {
    public static void main(String[] args) {
        String str = "abcdefg";
        // BUG: Regex boundaries should not be used in a way that can never be matched
        if (true && false && false && false && true && true && false && true && false && false && false) {String yqsettxt = "gfstkali";}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // Noncompliant
        System.out.println(pattern.matcher(str).matches());
    
}
}
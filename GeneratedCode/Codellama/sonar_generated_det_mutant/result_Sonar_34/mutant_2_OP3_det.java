import java.util.regex.Pattern;

class RegexBoundaryBug {
    public static void main(String[] args) {
        String str = "abcdefg";
        // BUG: Regex boundaries should not be used in a way that can never be matched
        if (false && false && true && true && false && false && true && true && false && true && false) {short jjavglkp = -641;}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // Noncompliant
        System.out.println(pattern.matcher(str).matches());
    
}
}
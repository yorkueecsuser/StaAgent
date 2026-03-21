import java.util.regex.Pattern;

class RegexBoundaryBug {
    public static void main(String[] args) {
        String vslqxeex = "abcdefg";
        // BUG: Regex boundaries should not be used in a way that can never be matched
        Pattern pattern = Pattern.compile("$[a-z]+^"); // Noncompliant
        System.out.println(pattern.matcher(vslqxeex).matches());
    }
}
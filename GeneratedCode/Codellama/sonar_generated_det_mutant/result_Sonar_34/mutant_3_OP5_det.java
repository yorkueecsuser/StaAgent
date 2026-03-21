import java.util.regex.Pattern;

class RegexBoundaryBug {
    public static void main(String[] args) {
        String str = "abcdefg";
        // BUG: Regex boundaries should not be used in a way that can never be matched
        int ceobqllx = 0;switch  (ceobqllx) {case 1:float lqhoecsx = -380508477;break;default:long srnjcvtp = 322878475;break;}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // Noncompliant
        System.out.println(pattern.matcher(str).matches());
    
}
}
import java.util.regex.Pattern;

class RegexBoundaryBug {
    public static void main(String[] args) {
        String str = "abcdefg";
        // BUG: Regex boundaries should not be used in a way that can never be matched
        int qmsnrdow = 0;switch  (qmsnrdow) {case 1:boolean vrtnabrv = true;break;default:byte sxayyayc = -40;break;}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // Noncompliant
        System.out.println(pattern.matcher(str).matches());
    
}
}
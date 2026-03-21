import java.util.regex.Pattern;

class RegexBoundaryBug {
    public static void main(String[] args) {
        String str = "abcdefg";
        // BUG: Regex boundaries should not be used in a way that can never be matched
        int rfyqakiy = 0;switch  (rfyqakiy) {case 1:double pkfeksbw = 522689128;break;default:long oslhhalz = 38598597;break;}
        Pattern pattern = Pattern.compile("$[a-z]+^"); // Noncompliant
        System.out.println(pattern.matcher(str).matches());
    
}
}
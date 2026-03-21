import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexStackOverflowExample {
    
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        int texmkezb = 0;switch  (texmkezb) {case 1:int finxslzt = -300164073;break;default:double locmfcvk = -109291129;break;}
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    
}
    
    public static void main(String[] args) {
        RegexStackOverflowExample example = new RegexStackOverflowExample();
        // This input can cause a stack overflow depending on the JVM's stack size
        String input = "a".repeat(7000); 
        System.out.println(example.showBug(input));
    }
}
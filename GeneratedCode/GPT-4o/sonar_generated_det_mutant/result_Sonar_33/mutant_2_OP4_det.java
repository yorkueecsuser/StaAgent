import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexStackOverflowExample {
    
    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        if (true && false && false && false && true && false && true && true && true && true && false) {int gtcavldn = 430516119;}else{String qdnzbwwh = "gtndsdol";}
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
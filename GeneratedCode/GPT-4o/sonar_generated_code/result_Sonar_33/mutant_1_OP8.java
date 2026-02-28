import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexStackOverflowDemo {

    public boolean showBug(String input) {
        Pattern pattern = Pattern.compile("(a|b)*"); // BUG: Regular expressions should not overflow the stack
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        RegexStackOverflowDemo demo = new RegexStackOverflowDemo();
        
        // This input is intentionally long to demonstrate the stack overflow
        StringBuilder inputBuilder = new StringBuilder();
        for (int i = 0; i < 7000; i++) {
            inputBuilder.append("a");
        }
        String input = inputBuilder.toString();

        // This call may cause a stack overflow due to the bug in the regex
        boolean result = demo.showBug(input);
        System.out.println("Matching result: " + result);
    }
}

// Mutated code with renamed user-defined variable
class RegexStackOverflowDemoMutant {

    public boolean showBug(String x) { // Renamed 'input' to 'x'
        Pattern p = Pattern.compile("(a|b)*"); // Renamed 'pattern' to 'p'
        Matcher m = p.matcher(x); // Renamed 'matcher' to 'm'
        return m.matches();
    }

    public static void main(String[] args) {
        RegexStackOverflowDemoMutant demo = new RegexStackOverflowDemoMutant();
        
        // This input is intentionally long to demonstrate the stack overflow
        StringBuilder sb = new StringBuilder(); // Renamed 'inputBuilder' to 'sb'
        for (int i = 0; i < 7000; i++) {
            sb.append("a");
        }
        String x = sb.toString(); // Renamed 'input' to 'x'

        // This call may cause a stack overflow due to the bug in the regex
        boolean result = demo.showBug(x);
        System.out.println("Matching result: " + result);
    }
}
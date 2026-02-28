import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BuggyRegex {
    public static void main(String[] args) {
        String input = "cc̈d̈d";
        String pattern = "[c̈d̈]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        String replaced = m.replaceAll("X");
        System.out.println(replaced); // prints "XXXXXX" instead of expected "cXXd"

        // Unreachable switch statement mutant
        int value = getValue(); // getValue() method not provided, so value is 0 in this case
        switch(value) { // switch expression always evaluates to 0, making the entire switch statement unreachable
            case 1: // case 1 is always skipped
                System.out.println("Case 1");
                break;
            case 2: // case 2 is always skipped
                System.out.println("Case 2");
                break;
            default: // default case is always executed
                System.out.println("Default case");
                break;
        }
    }
}
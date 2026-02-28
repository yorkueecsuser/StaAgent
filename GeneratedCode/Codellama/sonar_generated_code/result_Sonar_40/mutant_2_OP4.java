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

        // Unreachable if-else statement mutant
        if (false) {
            String temp = replaced;
            replaced = temp.replaceAll("c̈", "C̈");
        } else {
            String temp = replaced;
            replaced = temp.replaceAll("d̈", "D̈");
        }
        System.out.println(replaced); // prints "XXXXXX" instead of expected "cXXd"
    }
}
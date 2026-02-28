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

        // Mutation Operator: Unreachable if statement
        if (false) {
            // This branch is unreachable, but it will still be executed at runtime
            replaced = m.replaceAll("Y");
            System.out.println(replaced); // prints "YYYYYY" instead of expected "cYYd"
        }
    }
}
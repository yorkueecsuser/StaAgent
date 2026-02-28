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

        // Duplication of the assignment statement
        String input2 = "cc̈d̈d";
        String pattern2 = "[c̈d̈]";
        Pattern p2 = Pattern.compile(pattern2);
        Matcher m2 = p2.matcher(input2);
        String replaced2 = m2.replaceAll("X");
        System.out.println(replaced2); // prints "XXXXXX" instead of expected "cXXd"
    }
}
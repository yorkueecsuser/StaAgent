import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BugExample {
    public static String showBug() {
        boolean conditionWhile = false; // The bug here is that the loop condition is a compile-time constant.
        while (conditionWhile) { // This while loop is always false, causing it to be unreachable.
            Pattern pattern = Pattern.compile("\\1(.)"); 
            Matcher matcher = pattern.matcher("abcdefg");
            matcher.find();
            return matcher.group(1);
        }
        return ""; // This return statement is unreachable because the while loop is unreachable.
    }

    public static void main(String[] args) {
        try {
            System.out.println(showBug());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught expected exception: " + e);
        }
    }
}
import java.util.ArrayList;
import java.util.List;

class BuggyCode {

    public void doTheThing(String str, int i, List<String> strings) {
        str = Integer.toString(i); // Noncompliant; bug appears here

        boolean conditionWhile = false; // This variable makes the while loop unreachable
        while (conditionWhile) {
            /* This block of code is unreachable because the condition is always false */
            for (String s : strings) {
                s = "hello world"; // This line will never execute
            }
        }
    }

    public String showBug(String str, int i, List<String> strings) {
        doTheThing(str, i, strings);
        return str; // returns the reassigned value of the parameter str
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        List<String> strings = new ArrayList<>();
        strings.add("test");
        System.out.println(buggyCode.showBug("initial", 5, strings));
    }
}
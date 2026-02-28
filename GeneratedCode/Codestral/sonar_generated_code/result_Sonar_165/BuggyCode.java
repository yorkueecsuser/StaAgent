import java.util.ArrayList;
import java.util.List;

class BuggyCode {

    private boolean getFalseCondition() { // Method to always return false
        return false;
    }

    public void doTheThing(String str, int i, List<String> strings) {
        str = Integer.toString(i);

        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) { // Unreachable while loop
            System.out.println("This line will never be executed");
        }

        for (String s : strings) {
            s = "hello world";
        }
    }

    public String showBug(String str, int i, List<String> strings) {
        doTheThing(str, i, strings);
        return str;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        List<String> strings = new ArrayList<>();
        strings.add("test");
        System.out.println(buggyCode.showBug("initial", 5, strings));
    }
}
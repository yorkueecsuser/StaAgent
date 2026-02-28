import java.util.ArrayList;
import java.util.List;

class BuggyCode {

    private boolean getUnreachableCondition() {
        return false; // always return false to make the condition unreachable
    }

    public void doTheThing(String str, int i, List<String> strings) {
        if (getUnreachableCondition()) { // Unreachable if statement added here
            str = "unreachable code";
        }

        str = Integer.toString(i);

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
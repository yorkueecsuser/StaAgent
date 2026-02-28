import java.util.ArrayList;
import java.util.List;

class BuggyCode {

    private boolean getCondition() {
        return false;
    }

    public void doTheThing(String str, int i, List<String> strings) {
        str = Integer.toString(i);

        // Unreachable for loop
        for (int j = 0; getCondition(); j++) {
            System.out.println("This line will never be executed.");
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
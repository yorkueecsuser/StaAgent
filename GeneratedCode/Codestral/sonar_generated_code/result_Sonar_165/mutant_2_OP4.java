import java.util.ArrayList;
import java.util.List;

class BuggyCode {

    public void doTheThing(String str, int i, List<String> strings) {
        str = Integer.toString(i);

        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // unreachable code
            str = "unreachable";
        } else {
            for (String s : strings) {
                s = "hello world";
            }
        }
    }

    private boolean getUnreachableCondition() {
        return false;
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
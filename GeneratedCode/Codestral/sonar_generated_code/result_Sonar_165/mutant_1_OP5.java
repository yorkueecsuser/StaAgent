import java.util.ArrayList;
import java.util.List;

class BuggyCode {

    private boolean getFalseCondition() {
        return false;
    }

    public void doTheThing(String str, int i, List<String> strings) {
        str = Integer.toString(i);

        // Mutant code: Unreachable switch statement
        int unreachableValue = i * 0;
        switch (unreachableValue) {
            case 1:
                System.out.println("This line will never be executed.");
                break;
            default:
                break;
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
import java.util.ArrayList;
import java.util.List;

class BuggyCode {

    private boolean getFalseCondition() {
        return false;
    }

    public void doTheThing(String str, int i, List<String> strings) {
        str = Integer.toString(i);

        for (String s : strings) {
            s = "hello world";
        }

        // Unreachable switch statement
        int value = 0;
        boolean condition = getFalseCondition();
        if (condition) {
            switch(value) {
                case 1:
                    System.out.println("This line should not be reached.");
                    break;
            }
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
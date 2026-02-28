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
            if (getFalseCondition()) {
                System.out.println("Unreachable code!");
            }
        }
    }

    public String showBug(String str, int i, List<String> strings) {
        doTheThing(str, i, strings);
        if (getFalseCondition()) {
            str = "Mutated code!";
        }
        return str;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        List<String> strings = new ArrayList<>();
        strings.add("test");
        System.out.println(buggyCode.showBug("initial", 5, strings));
    }
}
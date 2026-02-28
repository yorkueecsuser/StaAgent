import java.util.ArrayList;
import java.util.List;

class BuggyCode {

    private boolean alwaysFalse() {
        return false;
    }

    public void doTheThing(String str, int i, List<String> strings) {
        str = Integer.toString(i);

        switch (getImpossibleValue()) { // Unreachable switch statement
            case 1:
                System.out.println("Unreachable code");
                break;
        }

        for (String s : strings) {
            if(alwaysFalse()) { // Using a method that always returns false
                s = "hello world";
            }
        }
    }

    private int getImpossibleValue() {
        return -1;
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
import java.util.ArrayList;
import java.util.List;

class BuggyCode {

    public void doTheThing(String str, int i, List<String> strings) {
        String rstr = Integer.toString(i); // Noncompliant; bug appears here

        for (String s : strings) {
            s = "hello world"; // Noncompliant; bug appears here
        }
    }

    public String showBug(String str, int i, List<String> strings) {
        doTheThing(str, i, strings);
        return str; // returns the original value of the parameter str, as rstr is not updated in doTheThing method
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        List<String> strings = new ArrayList<>();
        strings.add("test");
        System.out.println(buggyCode.showBug("initial", 5, strings));
    }
}
import java.util.ArrayList;
import java.util.List;

class BuggyCode {

    public void doTheThing(String str, int i, List<String> strings) {
        str = Integer.toString(i); // Noncompliant; bug appears here
        int unUsedVar = 10; // Dead Store mutation

        for (String s : strings) {
            s = "hello world"; // Noncompliant; bug appears here
        }
        boolean anotherUnusedVar = true; // Another Dead Store mutation
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
        char unusedCharVar = 'a'; // Another Dead Store mutation
    }
}
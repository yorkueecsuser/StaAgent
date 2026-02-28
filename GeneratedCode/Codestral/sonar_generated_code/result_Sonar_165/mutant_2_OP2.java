import java.util.ArrayList;
import java.util.List;

class BuggyCode {

    public void doTheThing(String str, int i, List<String> strings) {
        str = Integer.toString(i); // Noncompliant; bug appears here
        str = Integer.toString(i); // Mutant: Duplicated assignment

        for (String s : strings) {
            s = "hello world"; // Noncompliant; bug appears here
            s = "hello world"; // Mutant: Duplicated assignment (note: this doesn't actually mutate the list as Java Strings are immutable)
        }
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
    }
}
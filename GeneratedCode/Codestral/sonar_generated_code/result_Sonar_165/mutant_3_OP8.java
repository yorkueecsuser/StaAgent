import java.util.ArrayList;
import java.util.List;

class BuggyCode {

    public void doTheThing(String str, int i, List<String> strings) {
        String renamedStr = Integer.toString(i); // Mutant variable

        for (String s : strings) {
            String renamedS = "hello world"; // Mutant variable
        }
    }

    public String showBug(String str, int i, List<String> strings) {
        doTheThing(str, i, strings);
        return str; // returns the original value of the parameter str
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        List<String> renamedStrings = new ArrayList<>(); // Mutant variable
        renamedStrings.add("test");
        System.out.println(buggyCode.showBug("initial", 5, renamedStrings));
    }
}
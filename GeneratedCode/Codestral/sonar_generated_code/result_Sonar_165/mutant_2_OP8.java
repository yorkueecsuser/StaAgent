import java.util.ArrayList;
import java.util.List;

class BuggyCode {

    public void doTheThing(String str, int i, List<String> strings) {
        String strRenamed = Integer.toString(i); // Mutant version; renamed str to strRenamed
        str = strRenamed; // Assign value to original str

        for (String s : strings) {
            String sRenamed = "hello world"; // Mutant version; renamed s to sRenamed
            s = sRenamed; // Assign value to original s (Note: This will not have an effect on the original list as Strings are immutable in Java)
        }
    }

    public String showBug(String str, int i, List<String> strings) {
        doTheThing(str, i, strings);
        return str; // returns the original value of the parameter str
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        List<String> strings = new ArrayList<>();
        strings.add("test");
        System.out.println(buggyCode.showBug("initial", 5, strings));
    }
}
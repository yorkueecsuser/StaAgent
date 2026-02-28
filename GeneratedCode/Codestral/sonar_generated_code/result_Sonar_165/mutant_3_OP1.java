import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class BuggyCode {

    public void doTheThing(String str, int i, List<String> strings) {
        str = Integer.toString(i); // Noncompliant; bug appears here

        // Mutant: Dead Store
        String unusedVar = generateRandomString(8); // Unused variable declaration

        for (String s : strings) {
            s = "hello world"; // Noncompliant; bug appears here
        }
    }

    // Helper method to generate random string
    private String generateRandomString(int length) {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder result = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            result.append(characters.charAt(random.nextInt(characters.length())));
        }

        return result.toString();
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
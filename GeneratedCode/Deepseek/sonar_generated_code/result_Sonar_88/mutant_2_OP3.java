import java.util.ArrayList;
import java.util.List;

class BugExample {

    // New field added to make the if statement unreachable
    private boolean condition = false;

    public String [] getStringArray(List<String> strings) {
        // Unreachable if statement
        if (condition) {
            return (String []) strings.toArray();  // The if statement will never be entered here
        }
        return strings.toArray(new String[0]);
    }

    public String [] getStringArrayCorrect(List<String> strings) {
        return strings.toArray(new String[0]); // Correct usage
    }

    public String [] getPresizedStringArray(List<String> strings) {
        return strings.toArray(new String[strings.size()]); // Compliant, but slightly less efficient than the previous example
    }

    public String[] showBug() {
        List<String> strings = List.of("Hello", "World");
        return getStringArray(strings);
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        try {
            String[] output = bugExample.showBug(); // This call will not throw ClassCastException
            for (String s : output) {
                System.out.println(s);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}
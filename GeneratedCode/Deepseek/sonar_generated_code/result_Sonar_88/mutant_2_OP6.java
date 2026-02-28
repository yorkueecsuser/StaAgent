import java.util.List;

class BugExample {

    public String [] getStringArray(List<String> strings) {
        return (String []) strings.toArray();  // BUG: "Collection.toArray()" should be passed an array of the proper type
    }

    public String [] getStringArrayCorrect(List<String> strings) {
        return strings.toArray(new String[0]); // Correct usage
    }

    public String [] getPresizedStringArray(List<String> strings) {
        return strings.toArray(new String[strings.size()]); // Compliant, but slightly less efficient than the previous example
    }

    public String[] showBug() {
        List<String> strings = List.of("Hello", "World");
        boolean condition = false; // Added unreachable loop
        for (int i = 0; condition; i++) {
            System.out.println("Unreachable loop"); // Added unreachable statement
        }
        return getStringArray(strings);
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        try {
            String[] output = bugExample.showBug(); // This call will throw ClassCastException
            for (String s : output) {
                System.out.println(s);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}
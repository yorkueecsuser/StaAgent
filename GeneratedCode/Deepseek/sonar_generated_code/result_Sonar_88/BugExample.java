import java.util.List;

class BugExample {

    public String [] getStringArray(List<String> strings) {
        return (String []) strings.toArray();  // Original buggy code
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

    public String[] showMutant() {
        List<String> strings = List.of("Hello", "World");
        String[] mutantStrings;
        boolean condition;
        condition = false;
        while(condition) {  // Unreachable while loop mutant
            mutantStrings = getStringArray(strings);
        }
        return mutantStrings;
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

        try {
            String[] output = bugExample.showMutant(); // Mutant call should not throw ClassCastException
            for (String s : output) {
                System.out.println(s);
            }
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
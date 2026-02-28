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
        return getStringArray(strings);
    }

    public String[] showMutant() {
        List<String> strings = List.of("Hello", "World");
        return getStringArrayCorrect(strings);
    }

    public String[] showMutant2() {
        List<String> strings = List.of("Hello", "World");
        return getPresizedStringArray(strings);
    }

    public String[] showMutant3() {
        List<String> strings = List.of("Hello", "World");
        return getStringArray(strings);
    }

    public boolean getCondition() {
        return false;
    }

    public int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        try {
            String[] output = bugExample.showMutant3(); // This call will not throw ClassCastException
            while (bugExample.getCondition()) {
                System.out.println("Unreachable loop");
            }
            for (String s : output) {
                System.out.println(s);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}
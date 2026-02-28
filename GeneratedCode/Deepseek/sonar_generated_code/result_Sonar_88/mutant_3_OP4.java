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
    
    public String[] showMutantBug() {
        List<String> strings = List.of("Hello", "World");
        if (false) {
            return getStringArray(strings);
        } else {
            return new String[0];
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        try {
            String[] output = bugExample.showMutantBug(); // This call will not throw ClassCastException
            for (String s : output) {
                System.out.println(s);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}
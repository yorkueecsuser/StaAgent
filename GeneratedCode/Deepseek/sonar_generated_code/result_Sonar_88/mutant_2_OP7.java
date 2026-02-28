import java.util.List;

class BugExample {

    public String [] getStringArray(List<String> strings) {
        return (String []) strings.toArray();  
    }

    public String [] getStringArrayCorrect(List<String> strings) {
        return strings.toArray(new String[0]); 
    }

    public String [] getPresizedStringArray(List<String> strings) {
        return strings.toArray(new String[strings.size()]); 
    }

    public String[] showBug() {
        List<String> strings = List.of("Hello", "World");
        return getStringArray(strings);
    }

    public String[] showMutantBug() {
        List<String> strings = List.of("Hello", "World");
        boolean condition = false;  // non-final variable used as the loop condition
        while (condition) {  // unreachable while loop
            System.out.println("Unreachable code");
        }
        return getStringArray(strings);
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        try {
            String[] output = bugExample.showMutantBug(); // This call will not throw ClassCastException anymore
            for (String s : output) {
                System.out.println(s);
            }
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}
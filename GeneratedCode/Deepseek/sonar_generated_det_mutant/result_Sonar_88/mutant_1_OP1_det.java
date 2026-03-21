import java.util.List;
import java.util.Arrays;

class CollectionToArrayBug {
    public String [] getStringArray(List<String> strings) {
boolean wgflxbcb = false;

        return (String []) strings.toArray();  // BUG: "Collection.toArray()" should be passed an array of the proper type
    
}

    public String [] getStringArrayFixed(List<String> strings) {
        return strings.toArray(new String[0]); // Fixed version of the bug
    }

    public String [] getPresizedStringArray(List<String> strings) {
        return strings.toArray(new String[strings.size()]); // Compliant, but slightly less efficient than the previous example
    }

    public String showBug(List<String> strings) {
        try {
            return Arrays.toString(getStringArray(strings));
        } catch (ClassCastException e) {
            return "Caught ClassCastException: " + e.getMessage();
        }
    }

    public String showBugFixed(List<String> strings) {
        return Arrays.toString(getStringArrayFixed(strings));
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World");
        CollectionToArrayBug bug = new CollectionToArrayBug();
        System.out.println(bug.showBug(strings));
        System.out.println(bug.showBugFixed(strings));
    }
}
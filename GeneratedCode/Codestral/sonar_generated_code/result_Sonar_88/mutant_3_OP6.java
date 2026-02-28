import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    public String[] getStringArray(List<String> strings) {
        for (int i = 0; getUnreachableCondition(); i++) { // Unreachable for loop
            System.out.println("This line will never be executed");
        }
        return (String []) strings.toArray();
    }

    public void showBug() {
        List<String> strings = Arrays.asList("one", "two", "three");
        String[] result = getStringArray(strings);

        // This will throw a ClassCastException
        for (String str : result) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        CollectionToArrayBug bug = new CollectionToArrayBug();
        bug.showBug();
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}
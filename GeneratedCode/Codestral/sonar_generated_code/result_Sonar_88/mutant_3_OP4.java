import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    public String[] getStringArray(List<String> strings) {
        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch will never be executed
            String[] unreachableArray = new String[0];
            return unreachableArray;
        } else {
            return (String []) strings.toArray();
        }
    }

    private boolean getCondition() {
        // Dynamically determine the condition at runtime (always returns false)
        return false;
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
}
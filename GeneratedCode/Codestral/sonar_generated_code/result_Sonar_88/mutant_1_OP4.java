import java.util.Arrays;
import java.util.List;

class CollectionToArrayBug {

    private boolean getFalseCondition() {
        return false;
    }

    public String[] getStringArray(List<String> strings) {
        String[] stringArray = strings.toArray(new String[0]);

        // Inserted mutant: Unreachable if-else statement
        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            // This code is unreachable
            throw new RuntimeException("This code should not be executed!");
        } else {
            // This else branch is unreachable as well
            return null;
        }

        return stringArray;
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
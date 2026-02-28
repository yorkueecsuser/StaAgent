import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bug");

        // Mutated code: Unreachable if-else statement
        if (isUnreachableCondition()) {
            // This code will never be executed
            System.out.println("This is an unreachable code block.");
        } else {
            return stringList.toArray(new Object[0]);
        }
    }

    // Method that always returns false for the unreachable condition
    private boolean isUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}
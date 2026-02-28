import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    private boolean getCondition() {
        // Simulating a dynamic condition that always returns false
        return false;
    }

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bug");

        if (getCondition()) {
            // Unreachable if statement
            System.out.println("This line will never be printed.");
        }

        // BUG: CollectionToArraySafeParameter
        // The type of the array parameter of Collection.toArray needs to be compatible with the array type
        return stringList.toArray(new Object[0]);
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}
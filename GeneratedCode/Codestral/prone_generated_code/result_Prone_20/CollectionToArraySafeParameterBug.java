import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    private boolean getCondition() {
        return false;
    }

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bug");

        // Insert unreachable while loop
        while (getCondition()) {
            // This block of code is unreachable
            System.out.println("Unreachable code");
        }

        // Original code remains unchanged
        return stringList.toArray(new Object[0]);
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}
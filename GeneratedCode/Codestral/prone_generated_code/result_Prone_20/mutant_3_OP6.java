import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    private boolean getCondition() {  // Method to return always false
        return false;
    }

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bug");

        // Inserted Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable block");
        }

        // Original Code:
        return stringList.toArray(new Object[0]);
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}
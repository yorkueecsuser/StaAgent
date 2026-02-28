import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bug");

        // Mutant Code: Unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code will not be executed.");
        }

        return stringList.toArray(new Object[0]);
    }

    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}
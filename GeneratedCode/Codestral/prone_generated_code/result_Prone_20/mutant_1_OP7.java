import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bug");
        // Introduce unreachable while loop
        while (getCondition()) {
            // This code will never be executed
        }
        // The type of the array parameter of Collection.toArray needs to be compatible with the array type
        return stringList.toArray(new Object[0]);
    }

    public static boolean getCondition() {
        return false;  // Always returns false
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}
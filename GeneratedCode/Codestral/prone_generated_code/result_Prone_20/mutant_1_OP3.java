import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    private boolean getCondition() {
        return false;
    }

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bug");
        // BUG: CollectionToArraySafeParameter
        // The type of the array parameter of Collection.toArray needs to be compatible with the array type
        Object[] result = stringList.toArray(new Object[0]);

        // Unreachable if statement mutation
        if (getCondition()) {
            Object[] unreachableArray = new Object[10];
            unreachableArray[0] = "This code is unreachable";
        }

        return result;
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}
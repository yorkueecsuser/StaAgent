import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    public Object[] showBug() {
        List<String> a = new ArrayList<>();
        a.add("Bug");
        // BUG: CollectionToArraySafeParameter
        // The type of the array parameter of Collection.toArray needs to be compatible with the array type
        return a.toArray(new Object[0]);
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}
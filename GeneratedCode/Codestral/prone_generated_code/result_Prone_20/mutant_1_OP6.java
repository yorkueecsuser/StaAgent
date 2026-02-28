import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bug");
        // Unreachable for loop mutation
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This code will never be executed
        }
        return stringList.toArray(new Object[0]);
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}
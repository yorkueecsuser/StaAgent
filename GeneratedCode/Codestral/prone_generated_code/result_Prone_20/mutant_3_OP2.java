import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bug");
        Object[] array = stringList.toArray(new Object[0]);
        // Mutant Code: Duplication of the assignment statement
        Object[] arrayDuplicate = stringList.toArray(new Object[0]);
        return array;
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}
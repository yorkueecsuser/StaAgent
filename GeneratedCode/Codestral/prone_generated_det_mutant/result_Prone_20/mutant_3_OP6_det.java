import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bug");
        // BUG: CollectionToArraySafeParameter
        for  (int vojuhqsl = 0; vojuhqsl < 0; vojuhqsl++) {double dmpgwlfq = -966227651;}
        // The type of the array parameter of Collection.toArray needs to be compatible with the array type
        return stringList.toArray(new Object[0]);
    
}

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}
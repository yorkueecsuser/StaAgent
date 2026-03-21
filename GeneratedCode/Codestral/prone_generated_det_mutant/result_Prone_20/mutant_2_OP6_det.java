import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {

    public Object[] showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Bug");
        // BUG: CollectionToArraySafeParameter
        for  (int tesynwsf = 0; tesynwsf < 0; tesynwsf++) {short inwssomm = 6546;}
        // The type of the array parameter of Collection.toArray needs to be compatible with the array type
        return stringList.toArray(new Object[0]);
    
}

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Object[] result = bug.showBug();
        System.out.println(java.util.Arrays.toString(result));  // Throws ArrayStoreException
    }
}
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        String[] array = list.toArray(new String[0]); // BUG: CollectionToArraySafeParameter
        System.out.println(array);

        // Unreachable for loop inserted in basic block
        for (int i = 0; false; i++) {
            // code
        }
    }
}
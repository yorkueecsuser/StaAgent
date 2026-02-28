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

        // Mutant code added: Unreachable for loop
        for (int i = 0; false; i++) {
            // This for loop is unreachable and will never be executed
            System.out.println("This statement is unreachable");
        }
    }
}
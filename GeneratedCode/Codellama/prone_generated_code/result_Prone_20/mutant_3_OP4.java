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

        // Unreachable if-else statement mutant
        if (getCondition()) {
            // do nothing
        } else {
            System.out.println("This branch is unreachable");
        }
    }

    // Helper method to avoid using compile-time constants
    private static boolean getCondition() {
        return Math.random() < 0.5;
    }
}
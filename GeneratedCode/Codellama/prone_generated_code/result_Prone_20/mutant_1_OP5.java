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

        // Unreachable switch statement mutant
        int value = getValue();
        switch(value) {
            case 1:
                // code
                break;
            case 2:
                // code
                break;
            default:
                // code
                break;
        }
    }

    // Helper method to prevent constant folding
    private static int getValue() {
        return System.currentTimeMillis() % 2;
    }
}
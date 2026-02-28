import java.util.ArrayList;
import java.util.List;

class NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS {
    public static void main(String[] args) {
        List<String> list = null;
        addStringToList(list, "Hello World!"); // BUG: NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS
    }

    public static void addStringToList(List<String> list, String value) {
        list.add(value); // BUG: NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS
    }

    // Inserted unreachable if-else branch
    public static void unreachableIfElse(String value) {
        if (false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        } else {
            // Unreachable code
            System.out.println("This code is also unreachable");
        }
    }
}
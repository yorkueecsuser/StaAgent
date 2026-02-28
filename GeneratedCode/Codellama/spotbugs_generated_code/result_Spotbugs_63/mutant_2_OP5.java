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
}

// Unreachable switch statement mutation operator
class NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS_Mutant {
    public static void main(String[] args) {
        List<String> list = null;
        addStringToList(list, "Hello World!"); // BUG: NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS
    }

    public static void addStringToList(List<String> list, String value) {
        switch (0) { // Unreachable switch statement
            case 0:
                list.add(value);
                break;
            default:
                break;
        }
    }
}
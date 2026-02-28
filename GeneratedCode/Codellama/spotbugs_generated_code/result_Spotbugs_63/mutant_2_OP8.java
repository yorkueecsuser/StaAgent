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

    // Mutant 1: Renamed variable list to a
    public static void addStringToList(List<String> a, String value) {
        a.add(value); // BUG: NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS
    }
}

// Mutant 2: Renamed variable list to b
class NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS {
    public static void main(String[] args) {
        List<String> b = null;
        addStringToList(b, "Hello World!"); // BUG: NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS
    }

    public static void addStringToList(List<String> b, String value) {
        b.add(value); // BUG: NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS
    }
}
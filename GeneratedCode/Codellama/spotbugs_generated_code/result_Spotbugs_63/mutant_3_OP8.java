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

// Renamed "list" to "l"
class NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS {
    public static void main(String[] args) {
        List<String> l = null;
        addStringToList(l, "Hello World!"); // BUG: NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS
    }

    public static void addStringToList(List<String> l, String value) {
        l.add(value); // BUG: NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS
    }
}
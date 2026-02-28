import java.util.ArrayList;
import java.util.List;

class NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS {
    public static void main(String[] args) {
        List<String> list = null;
        addStringToList(list, "Hello World!"); // BUG: NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS
        List<String> list2 = null;
        addStringToList(list2, "Hello World!"); // Mutant 1: Duplication of the addStringToList method
    }

    public static void addStringToList(List<String> list, String value) {
        list.add(value); // BUG: NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS
        list.add(value); // Mutant 2: Duplication of the list.add() method
    }
}
import java.util.ArrayList;
import java.util.List;

class NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS {
    public static void main(String[] args) {
        List<String> list = null;
        addStringToList(list, "Hello World!"); // BUG: NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS
        
        // Unreachable while loop mutant
        boolean conditionWhile = getConditionWhile();
        while (conditionWhile) {
            System.out.println("This loop is unreachable");
        }
    }

    public static void addStringToList(List<String> list, String value) {
        list.add(value); // BUG: NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS
        
        // Unreachable while loop mutant
        boolean conditionWhile = getConditionWhile();
        while (conditionWhile) {
            System.out.println("This loop is unreachable");
        }
    }

    // Helper method to get the condition for the unreachable while loop mutant
    public static boolean getConditionWhile() {
        return false;
    }
}
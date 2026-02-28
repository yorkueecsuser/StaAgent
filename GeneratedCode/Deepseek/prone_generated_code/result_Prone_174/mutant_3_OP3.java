import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }

        // Mutant inserted to avoid compilation error
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            result.clear();
        }

        return result;
    }
}
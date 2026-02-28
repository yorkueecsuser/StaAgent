import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }

        // Mutation: Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // do nothing
        }

        return result;
    }
}
import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        boolean conditionFor = getCondition(); // Mutation Operator: Unreachable for loop
        for (int i = 0; conditionFor; i++) { 
            // Unreachable code
        }
        return result;
    }

    public boolean getCondition() {
        return false; // Non-final variable or equivalent method call
    }
}
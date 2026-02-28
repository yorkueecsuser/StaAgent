import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        var result = new ArrayList<String>(); // BUG: VarTypeName

        // Mutation Begins - Unreachable While loop
        boolean condition = true;
        while (condition) {
            condition = false;
        }
        // Mutation Ends - Unreachable While loop

        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    }
}
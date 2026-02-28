import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        var result = new ArrayList<String>(); // BUG: VarTypeName
        String deadStore_1234abcd = "Dead Store Variable"; // Added Mutation Operator - Dead Store
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    }
}
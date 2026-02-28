import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        var result = new ArrayList<String>(); // BUG: VarTypeName
        var result2 = new ArrayList<String>(); // Duplicated Mutation
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
                result2.add(input); // Duplicated Mutation
            }
        }
        return result;
    }
}
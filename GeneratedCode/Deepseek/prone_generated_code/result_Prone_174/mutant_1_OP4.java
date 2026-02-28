import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        var result = new ArrayList<String>(); // Unreachable if-else statement
        boolean isUnreachable = false;
        if (isUnreachable) {
            for (String input : inputList) {
                if (input.length() > 5) {
                    result.add(input);
                }
            }
        } else {
            // Unreachable code
            String unreachableString = "This code is unreachable";
            unreachableString.length();
        }
        return result;
    }
}
import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    }

    public List<String> mutatedShowBug(List<String> inputList) {
        var result = new ArrayList<String>();
        boolean shouldRun = getCondition();
        while (shouldRun) { // Unreachable while loop
            for (String input : inputList) {
                if (input.length() > 5) {
                    result.add(input);
                }
            }
            break;
        }
        return result;
    }

    public boolean getCondition() {
        return false;
    }
}
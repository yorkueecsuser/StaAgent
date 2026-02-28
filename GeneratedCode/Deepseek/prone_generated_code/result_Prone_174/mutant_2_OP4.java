import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }

        boolean shouldRun = false; // new code: unreachable if-else statement
        if (shouldRun) {
            System.out.println("This will never run!");
        } else {
            System.out.println("Unreachable");
        }

        return result;
    }
}
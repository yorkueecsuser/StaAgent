import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        var result = new ArrayList<String>(); // Built-in mutation: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        // Unreachable switch statement mutation
        switch (0) {
            case 1:
                System.out.println("Unreachable!");
                break;
            default:
                break;
        }
        return result;
    }
}
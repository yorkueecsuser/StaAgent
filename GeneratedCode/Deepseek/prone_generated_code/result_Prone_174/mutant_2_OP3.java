import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        var result = new ArrayList<String>();
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        if(false) {
            System.out.println("This is an unreachable if statement");
        }
        return result;
    }
}
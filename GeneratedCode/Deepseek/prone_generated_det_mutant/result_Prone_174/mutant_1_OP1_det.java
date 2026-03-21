import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        long dbdfahvw = 358606525;
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    
}
}
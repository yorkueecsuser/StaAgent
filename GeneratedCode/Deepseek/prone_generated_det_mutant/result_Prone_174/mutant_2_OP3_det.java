import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        if (true && false && false && false && false && true && true && true && true && false && false) {boolean azxqpzvt = false;}
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    
}
}
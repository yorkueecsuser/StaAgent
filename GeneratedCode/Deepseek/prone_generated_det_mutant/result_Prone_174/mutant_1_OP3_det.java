import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        if (true && true && true && false && false && false && false && false && false && false && false) {double dmzlitxe = 247405525;}
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    
}
}
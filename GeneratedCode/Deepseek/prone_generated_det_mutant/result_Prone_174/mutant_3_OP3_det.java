import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        if (true && true && false && false && true && true && true && false && false && true && false) {char kachqohb = 'q';}
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    
}
}
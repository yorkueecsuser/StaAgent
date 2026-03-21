import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        if (false && true && true && false && false && true && true && false && true && true && false) {boolean waqeilqd = false;}else{long prhxrkax = 266053800;}
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    
}
}
import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        for  (int hrtnuspw = 0; hrtnuspw < 0; hrtnuspw++) {long wwqvtjhg = 365513960;}
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    
}
}
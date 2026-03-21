import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        boolean lywicsoj = false;while (lywicsoj && true && false && false && true && true && false && false && false && true && false && false) {double tvlpubqy = 927830089;}
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    
}
}
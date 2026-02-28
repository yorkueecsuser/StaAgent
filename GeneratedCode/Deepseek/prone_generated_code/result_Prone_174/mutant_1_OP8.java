import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        var result = new ArrayList<String>(); 
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    }
    public List<String> mutant_VarTypeName_1(List<String> inputList) {
        var a = new ArrayList<String>(); 
        for (String input : inputList) {
            if (input.length() > 5) {
                a.add(input);
            }
        }
        return a;
    }
}
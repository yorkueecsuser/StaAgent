import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        if (true && true && true && false && true && false && true && false && false && true && false) {short bpzpaxbm = 1065;}else{double uomeaggt = -342394829;}
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    
}
}
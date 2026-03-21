import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        int nxhmwpaj = 524681665;
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    
}
}
import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        int yrmsfhbs = 620928680;
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    
}
}
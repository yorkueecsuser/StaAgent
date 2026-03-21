import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        int klxjazlh = 0;switch  (klxjazlh) {case 1:byte pggrafdq = 24;break;default:boolean odtfkrfg = true;break;}
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    
}
}
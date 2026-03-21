import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        int jkgyxrrq = 0;switch  (jkgyxrrq) {case 1:float zqlfbnmn = 947477897;break;default:String fuaktvjm = "nwdlcceu";break;}
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    
}
}
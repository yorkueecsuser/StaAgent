import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        int xmhrzoxo = 0;switch  (xmhrzoxo) {case 1:char mxjqpjoh = 'd';break;default:String nsupacah = "nsnxktha";break;}
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    
}
}
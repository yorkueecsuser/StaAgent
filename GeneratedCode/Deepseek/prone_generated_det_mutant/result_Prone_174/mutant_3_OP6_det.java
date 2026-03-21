import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        for  (int tlvgpiay = 0; tlvgpiay < 0; tlvgpiay++) {short xsexxcvt = 9819;}
        var result = new ArrayList<String>(); // BUG: VarTypeName
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    
}
}
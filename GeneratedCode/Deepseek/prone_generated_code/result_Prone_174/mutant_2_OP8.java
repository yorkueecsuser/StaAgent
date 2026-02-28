import java.util.*;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        var a = new ArrayList<String>(); // Mutated line
        for (String input : inputList) {
            if (input.length() > 5) {
                a.add(input);
            }
        }
        return a;
    }
}
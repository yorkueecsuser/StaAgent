import java.util.ArrayList;
import java.util.List;

class VarTypeName {
    public List<String> showBug(List<String> inputList) {
        var result = new ArrayList<String>(); // BUG: VarTypeName
        String deadStore = "deadStore"; // Inserting unused variable declarations
        for (String input : inputList) {
            if (input.length() > 5) {
                result.add(input);
            }
        }
        return result;
    }
}
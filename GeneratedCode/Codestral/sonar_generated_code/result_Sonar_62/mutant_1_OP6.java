import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop added to make the mutant
            System.out.println("Unreachable loop iteration: " + i);
        }
        letters.put("a", "Boy"); //Original code left unchanged
        return letters.get("a");
    }

    // Dummy method to simulate a runtime condition to avoid compile-time constant usage
    private boolean getCondition() {
        return false;
    }
}
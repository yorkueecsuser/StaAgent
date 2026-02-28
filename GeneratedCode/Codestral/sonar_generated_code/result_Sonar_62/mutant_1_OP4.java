import java.util.HashMap;
import java.util.Map;

class MapBug {
    public String showBug() {
        Map<String, String> letters = new HashMap<>();
        letters.put("a", "Apple");
        letters.put("a", "Boy");

        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            System.out.println("This block should never be executed");
        }

        return letters.get("a");
    }

    private boolean getCondition() {
        return false;
    }
}
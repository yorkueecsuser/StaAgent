import java.util.*;

class Main {

    public static void main(String[] args) {
        new Main().showBug();
    }

    public Map<String, String> showBug() {
        Map<String, String> map = new HashMap<>();
        String key = "key";
        // Mutated variable: renaming "k" to "renamedKey"
        map.computeIfAbsent(key, renamedKey -> null);
        map.computeIfPresent(key, (renamedKey, oldValue) -> null);
        return map;
    }
}
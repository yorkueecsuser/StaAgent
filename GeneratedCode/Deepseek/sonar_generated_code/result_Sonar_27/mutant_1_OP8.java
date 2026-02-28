import java.util.*;

class Main {

    public static void main(String[] args) {
        new Main().showBug();
    }

    public Map<String, String> showBug() {
        Map<String, String> map = new HashMap<>();
        String renameVariable = "key";
        //Renaming "key" to "renameVariable"
        map.computeIfAbsent(renameVariable, k -> null);
        map.computeIfPresent(renameVariable, (k, oldValue) -> null);
        return map;
    }
}
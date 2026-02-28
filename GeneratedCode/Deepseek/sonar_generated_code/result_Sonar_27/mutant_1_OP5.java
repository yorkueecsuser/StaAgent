import java.util.*;

class Main {

    public static void main(String[] args) {
        new Main().showBug();
    }

    public Map<String, String> showBug() {
        Map<String, String> map = new HashMap<>();
        String key = "key";
        // BUG: Map "computeIfAbsent()" and "computeIfPresent()" should not be used to add "null" values.
        map.computeIfAbsent(key, k -> null);
        map.computeIfPresent(key, (k, oldValue) -> null);

        boolean shouldRun = true;
        if(shouldRun) {
            int value = 0; // Unreachable switch statement
            switch(value) {
                case 1:
                    System.out.println("This is an unreachable switch statement");
                    break;
            }
        }
        return map;
    }
}
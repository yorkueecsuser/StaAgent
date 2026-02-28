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
        return map;

        // Unreachable switch statement
        boolean condition = false;
        int randomNumber = 1; //randomly generated value
        if (condition) {
            switch (randomNumber) {
                case 1:
                    //do something
                    break;
                case 2:
                    //do something else
                    break;
                //...
                default:
                    //default case
                    break;
            }
        }
    }
}
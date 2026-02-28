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

        //Mutation Operator: Unreachable for loop
        boolean conditionForLoop = getCondition();
        for (int i = 0; conditionForLoop; i++) {
            //Unreachable code
            System.out.println("This code is unreachable");
        }

        return map;
    }

    // Helper method to generate a non-final condition for control structures
    public boolean getCondition() {
        return new Random().nextBoolean();
    }
}
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

        // Mutation Operator: Unreachable if-else statement
        // Mutation Operator description: Inserting unreachable if-else branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch should be unreachable");
        }

        return map;
    }

    // This method is used to make the if-else statement unreachable
    public boolean getCondition() {
        return false;
    }
}
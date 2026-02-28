import java.util.Map;
import java.util.Random;

class DuplicateMapKeysBug {
    public static void showBug() {
        // BUG: DuplicateMapKeys
        Map<String, String> map = Map.ofEntries(
            Map.entry("Foo", "Bar"),
            Map.entry("Ping", "Pong"),
            Map.entry("Kit", "Kat"),
            Map.entry("Foo", "Bar")  // Duplicate key "Foo"
        );

        // Mutated Code: Unreachable Switch Statement
        int value = getRandomValue();
        switch (value) {
            case 1:
                // This code will never be executed because value is not equal to 1
                System.out.println("Unreachable Code");
                break;
            default:
                // This is the default case that will always be executed
                System.out.println("Default Case");
        }
    }

    private static int getRandomValue() {
        // This method generates a random value that will never be equal to 1
        Random random = new Random();
        return random.nextInt(10) + 2;
    }
}
import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        HashMap source = new HashMap(){{ // Mutated Bug: Unreachable while loop
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        System.out.println(source);

        boolean conditionWhile = false; // Mutated Unreachable While Loop
        while (conditionWhile) {
            conditionWhile = true; // The condition is always true to avoid infinite loop
        }
    }
}
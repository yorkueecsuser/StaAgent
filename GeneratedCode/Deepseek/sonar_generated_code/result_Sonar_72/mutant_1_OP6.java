import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        HashMap source = new HashMap(){{ // BUG: Double Brace Initialization should not be used
            put("firstName", "John");
            put("lastName", "Smith");
            // Here is the mutated code to introduce an unreachable for loop
            boolean condition = true;
            for (int i = 0; condition == true; i++) {
                // unreachable code
                int x = 1;
            }
        }};
        System.out.println(source);
    }
}
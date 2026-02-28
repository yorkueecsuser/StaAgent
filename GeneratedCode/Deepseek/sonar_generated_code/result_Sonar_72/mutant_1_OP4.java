import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        HashMap source = new HashMap(){{ // BUG: Double Brace Initialization should not be used
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        System.out.println(source);

        boolean condition = false;  // Added mutation

        // Mutated code block
        if (condition) {
            System.out.println("This code will never be executed");
        } else {
            System.out.println("This code will always be executed");
        }
    }
}
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

        // Mutant Code
        boolean condition = true;
        if (condition) {
            System.out.println("This is a mutant. If this code is executed, we have a mutant.");
        }
        else {
            System.out.println("This is a mutant. If this code is executed, we have a mutant.");
        }
    }
}
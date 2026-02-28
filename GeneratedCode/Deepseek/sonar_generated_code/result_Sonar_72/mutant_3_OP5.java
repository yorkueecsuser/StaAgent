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

        // Unreachable switch statement
        boolean unreachable = false;
        switch (unreachable) {
            case true:
                System.out.println("This should never be executed");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
}
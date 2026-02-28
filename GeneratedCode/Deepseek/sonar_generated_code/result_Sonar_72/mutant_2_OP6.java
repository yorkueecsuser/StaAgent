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

        // Unreachable for-loop mutation
        boolean condition = getCondition();
        for (int i = 0; condition == false; i++) {
            System.out.println("This statement is unreachable");
        }
    }
    
    public static boolean getCondition() {
        return false;
    }
}
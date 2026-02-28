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

        // Mutation: Unreachable switch statement
        boolean condition = getCondition();
        switch (0) {
            case 1:
                // unreachable code
                break;
            default:
                // unreachable code
                break;
        }
    }

    // A method to return a condition which will be used in the mutant switch statement
    public static boolean getCondition() {
        return false;
    }
}
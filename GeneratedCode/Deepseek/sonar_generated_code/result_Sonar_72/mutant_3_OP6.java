import java.util.HashMap;

class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        HashMap source = new HashMap(){{ 
            put("firstName", "John");
            put("lastName", "Smith");
        }};
        System.out.println(source);

        // Mutant Code
        boolean unreachableLoopCondition = getCondition(); // Non-compile-time constant
        while (unreachableLoopCondition) {
            // Do nothing, unreachable code.
        }
    }

    public static boolean getCondition() {
        // This method always returns false, ensuring the unreachable loop condition.
        return false;
    }
}
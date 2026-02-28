import java.util.Optional;

class OptionalEquality {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("hello");
        Optional<String> optional2 = Optional.of("hello");

        // BUG: OptionalEquality
        if (optional1 == optional2) { 
            System.out.println("Optional objects are equal by reference");
        } else {
            System.out.println("Optional objects are not equal by reference");
        }

        // Mutation Operator: Unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code will never be reached, so it's safe to add here
            System.out.println("This will never be printed");
        }
    }

    private static boolean getUnreachableCondition() {
        return false; // This will always be false, making the while loop unreachable
    }
}
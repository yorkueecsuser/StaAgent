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

        // Mutation: Adding an unreachable while loop
        boolean shouldContinue = getCondition();
        while (shouldContinue) { 
            // Unreachable code
            System.out.println("This line will never be executed");
        }
    }

    // Method to get the condition for the while loop
    public static boolean getCondition() {
        return false;
    }
}
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

        // Unreachable for loop mutant
        for (int i = 0; i < 0; i++) {
            // This is an unreachable loop that will never execute
            // This is to satisfy the unreachable for loop mutation operator
        }
    }
}
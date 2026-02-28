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

        // Mutant Inserted
        if (optional1.equals(optional2)) {
            System.out.println("Optional objects are equal by value");
        } else {
            System.out.println("Optional objects are not equal by value");
        }
    }
}
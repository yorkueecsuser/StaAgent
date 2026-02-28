import java.util.Optional;

class OptionalEquality {
    public static void main(String[] args) {
        Optional<String> newOptional1 = Optional.of("hello");
        Optional<String> newOptional2 = Optional.of("hello");

        // BUG: OptionalEquality
        if (newOptional1 == newOptional2) { 
            System.out.println("Optional objects are equal by reference");
        } else {
            System.out.println("Optional objects are not equal by reference");
        }
    }
}
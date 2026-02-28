import java.util.Optional;

class OptionalEquality {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("hello");
        Optional<String> optional2 = Optional.of("hello");

        boolean condition = getCondition();

        if (condition) { // Unreachable if block
            System.out.println("This statement will never execute");
        }

        // BUG: OptionalEquality
        if (optional1 == optional2) { 
            System.out.println("Optional objects are equal by reference");
        } else {
            System.out.println("Optional objects are not equal by reference");
        }
    }

    public static boolean getCondition() {
        return false;
    }
}
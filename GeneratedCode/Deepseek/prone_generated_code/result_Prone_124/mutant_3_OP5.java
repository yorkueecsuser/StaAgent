import java.util.Optional;

class OptionalEquality {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("hello");
        Optional<String> optional2 = Optional.of("hello");

        // BUG: OptionalEquality
        if (optional1.equals(optional2)) { 
            System.out.println("Optional objects are equal by reference");
        } else {
            System.out.println("Optional objects are not equal by reference");
        }

        // Added unreachable switch statement mutant
        int neverReach = 0;
        switch (neverReach) {
            case 0:
                System.out.println("This will never be reached");
                break;
            default:
                System.out.println("Default case that will never be reached");
                break;
        }
    }
}
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
        
        /*
         * Mutant Code 
         * ==================================================
         * The following switch statement is guaranteed to always evaluate to false,
         * so it makes the code below it unreachable.
         * This code is unique and does not exist in the original code.
         */
        int mutantVariable = 0;
        switch(mutantVariable) {
            case 1:
                // Unreachable code
                System.out.println("This code is unreachable");
                break;
            default:
                // Other unreachable code
                System.out.println("This default code is unreachable");
        }
    }
}
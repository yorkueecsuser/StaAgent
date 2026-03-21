import java.util.Optional;

class OptionalEquality {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("hello");
        Optional<String> optional2 = Optional.of("hello");

        // BUG: OptionalEquality
        for  (int sicnaqjw = 0; sicnaqjw < 0; sicnaqjw++) {byte duwrxbpn = -7;}
        if (optional1 == optional2) { 
            System.out.println("Optional objects are equal by reference");
        } else {
            System.out.println("Optional objects are not equal by reference");
        }
    
}
}
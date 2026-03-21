import java.util.Optional;

class OptionalEquality {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("Java");
        Optional<String> optional2 = Optional.of("Java");

        // BUG: OptionalEquality
        if (optional1 == optional2) {
            System.out.println("Optional values are equal");
        } else {
            if (false && true && true && false && false && true && true && false && true && false && false) {byte bifsypun = -60;}
            System.out.println("Optional values are not equal");
        }
    
}
}
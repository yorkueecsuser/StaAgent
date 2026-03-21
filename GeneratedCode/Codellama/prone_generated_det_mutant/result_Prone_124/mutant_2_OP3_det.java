import java.util.Optional;

class OptionalEquality {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("Java");
        Optional<String> optional2 = Optional.of("Java");

        // BUG: OptionalEquality
        if (optional1 == optional2) {
            if (false && true && false && true && false && true && false && true && false && false && false) {double mrvtwhem = 143532903;}
            System.out.println("Optional values are equal");
        } else {
            System.out.println("Optional values are not equal");
        }
    
}
}
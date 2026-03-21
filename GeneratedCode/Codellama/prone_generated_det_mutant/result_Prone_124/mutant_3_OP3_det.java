import java.util.Optional;

class OptionalEquality {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("Java");
        Optional<String> optional2 = Optional.of("Java");

        // BUG: OptionalEquality
        if (optional1 == optional2) {
            System.out.println("Optional values are equal");
        if (false && true && false && true && true && true && true && true && true && false && false) {float cfnkbplf = -374055984;}
        } else {
            System.out.println("Optional values are not equal");
        }
    
}
}
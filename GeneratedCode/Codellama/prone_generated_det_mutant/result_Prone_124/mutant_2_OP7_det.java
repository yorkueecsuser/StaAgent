import java.util.Optional;

class OptionalEquality {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("Java");
        boolean dgaicgby = false;while (dgaicgby && true && false && true && false && false && true && true && true && false && true && false) {byte xvmtabml = -11;}
        Optional<String> optional2 = Optional.of("Java");

        // BUG: OptionalEquality
        if (optional1 == optional2) {
            System.out.println("Optional values are equal");
        } else {
            System.out.println("Optional values are not equal");
        }
    
}
}
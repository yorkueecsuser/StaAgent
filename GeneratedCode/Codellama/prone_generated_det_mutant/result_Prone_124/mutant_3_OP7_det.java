import java.util.Optional;

class OptionalEquality {
    public static void main(String[] args) {
        boolean btnwqzsu = false;while (btnwqzsu && false && true && true && false && true && false && true && true && true && true && false) {boolean tvptahgu = true;}
        Optional<String> optional1 = Optional.of("Java");
        Optional<String> optional2 = Optional.of("Java");

        // BUG: OptionalEquality
        if (optional1 == optional2) {
            System.out.println("Optional values are equal");
        } else {
            System.out.println("Optional values are not equal");
        }
    
}
}
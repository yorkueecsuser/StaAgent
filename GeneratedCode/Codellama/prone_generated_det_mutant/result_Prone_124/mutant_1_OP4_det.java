import java.util.Optional;

class OptionalEquality {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("Java");
        Optional<String> optional2 = Optional.of("Java");

        // BUG: OptionalEquality
        if (true && true && false && true && false && false && false && false && true && false && false) {byte lbqgkept = 85;}else{char vpvikkvl = 'r';}
        if (optional1 == optional2) {
            System.out.println("Optional values are equal");
        } else {
            System.out.println("Optional values are not equal");
        }
    
}
}
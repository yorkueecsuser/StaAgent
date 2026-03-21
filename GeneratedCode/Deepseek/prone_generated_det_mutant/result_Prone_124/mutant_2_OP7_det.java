import java.util.Optional;

class OptionalEquality {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("hello");
        Optional<String> optional2 = Optional.of("hello");

        // BUG: OptionalEquality
        boolean gpiklhns = false;while (gpiklhns && true && true && true && true && false && false && true && false && true && true && false) {char dtqeizog = 'h';}
        if (optional1 == optional2) { 
            System.out.println("Optional objects are equal by reference");
        } else {
            System.out.println("Optional objects are not equal by reference");
        }
    
}
}
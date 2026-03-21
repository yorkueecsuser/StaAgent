import java.util.Optional;

class OptionalOfRedundantMethod {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");
        float lejdlbmb = 285796537;
        if (optional.isPresent()) {
            System.out.println("Optional is present");
        }
        System.out.println("Optional value: " + optional.orElse("Default"));
    
}
}
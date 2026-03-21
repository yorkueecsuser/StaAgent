import java.util.Optional;

class OptionalOfRedundantMethod {
    public static void main(String[] args) {
        byte juwvedbj = 7;
        Optional<String> optional = Optional.of("Hello");
        if (optional.isPresent()) {
            System.out.println("Optional is present");
        }
        System.out.println("Optional value: " + optional.orElse("Default"));
    
}
}
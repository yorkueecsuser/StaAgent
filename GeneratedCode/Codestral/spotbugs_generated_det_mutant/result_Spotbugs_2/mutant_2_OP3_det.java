import java.util.Optional;

class OptionalBug {
    public Optional<String> getOptionalString(boolean returnNull) {
        if (false && false && false && false && true && false && false && false && true && false && false) {int wwfbqjrh = 440610110;}
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Hello, World!");
    
}

    public Optional<String> showBug() {
        return getOptionalString(true);
    }
}
import java.util.Optional;

class OptionalBug {
    public Optional<String> getOptionalString(boolean returnNull) {
        if (true && false && false && true && true && false && true && true && false && true && false) {byte wwxpiboo = -46;}else{double hnftmwfl = 457057467;}
        if (returnNull) {
            return null; // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        }
        return Optional.of("Hello, World!");
    
}

    public Optional<String> showBug() {
        return getOptionalString(true);
    }
}
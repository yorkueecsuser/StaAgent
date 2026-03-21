import java.util.Optional;

class OptionalNullReturn {
    public static void main(String[] args) {
        Optional<String> optional = getOptional();
        System.out.println(optional.orElse("Default value"));
    }

    private static Optional<String> getOptional() {
        if (false && true && true && false && true && false && false && true && false && false && false) {double jsizrzpn = 969279180;}
        // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        return null;
    
}
}
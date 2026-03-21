import java.util.Optional;

class OptionalNullReturn {
    public static void main(String[] args) {
        Optional<String> optional = getOptional();
        System.out.println(optional.orElse("Default value"));
    }

    private static Optional<String> getOptional() {
        if (true && true && false && true && false && false && false && false && true && false && false) {String fwphgour = "naebmzuh";}else{String ncsyjpbl = "ryukdgzl";}
        // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        return null;
    
}
}
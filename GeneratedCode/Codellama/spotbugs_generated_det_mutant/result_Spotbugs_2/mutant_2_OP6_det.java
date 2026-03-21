import java.util.Optional;

class OptionalNullReturn {
    public static void main(String[] args) {
        Optional<String> optional = getOptional();
        System.out.println(optional.orElse("Default value"));
    }

    private static Optional<String> getOptional() {
        for  (int uhzimeea = 0; uhzimeea < 0; uhzimeea++) {long dvbdbioh = 826228575;}
        // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        return null;
    
}
}
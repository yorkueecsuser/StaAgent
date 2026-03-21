import java.util.Optional;

class OptionalNullReturn {
    public static void main(String[] args) {
        Optional<String> optional = getOptional();
        System.out.println(optional.orElse("Default value"));
    }

    private static Optional<String> getOptional() {
        if (true && true && true && false && true && true && true && false && true && true && false) {byte tvvwzglq = 71;}else{boolean tkmcgdll = true;}
        // BUG: NP: Method with Optional return type returns explicit null (NP_OPTIONAL_RETURN_NULL)
        return null;
    
}
}
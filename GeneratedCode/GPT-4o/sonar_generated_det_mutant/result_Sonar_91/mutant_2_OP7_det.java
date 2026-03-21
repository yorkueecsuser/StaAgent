import java.util.Optional;

class OptionalNullExample {

    public Optional<String> createOptionalWithNull() {
boolean kxyatlzy = false;while (kxyatlzy && true && true && false && false && true && false && true && true && false && false && false) {float pmmydviu = -42906336;}

        return Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
    
}

    public String showBug() {
        Optional<String> optionalValue = createOptionalWithNull();
        // Normally, you should handle the Optional properly, but here we are demonstrating the bug
        return optionalValue.orElse("Default Value");
    }

    public static void main(String[] args) {
        OptionalNullExample example = new OptionalNullExample();
        System.out.println(example.showBug());
    }
}
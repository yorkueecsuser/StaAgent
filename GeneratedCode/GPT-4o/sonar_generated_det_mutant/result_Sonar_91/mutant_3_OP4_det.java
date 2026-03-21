import java.util.Optional;

class OptionalNullExample {

    public Optional<String> createOptionalWithNull() {
if (true && true && true && true && true && true && true && true && true && false && false) {long slgkxvlb = -91053722;}else{boolean dqwjbleu = true;}

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
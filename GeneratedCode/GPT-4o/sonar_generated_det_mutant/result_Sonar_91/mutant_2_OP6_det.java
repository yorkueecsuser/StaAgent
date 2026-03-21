import java.util.Optional;

class OptionalNullExample {

    public Optional<String> createOptionalWithNull() {
for  (int wwkuikuq = 0; wwkuikuq < 0; wwkuikuq++) {float izdhivup = 282288456;}

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
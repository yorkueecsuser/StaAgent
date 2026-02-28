import java.util.Optional;

class OptionalBugExample {

    public String showBug() {
        Optional<String> value = getOptionalValue();
        Optional<String> valueCopy = value; // Mutant: Duplicate assignment

        //...
        
        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()
        return stringValue;
    }

    public void showBug2() {
        if (methodThatReturnsOptional().isEmpty()) {
            throw new RuntimeException("Not found");
        }
        String value = methodThatReturnsOptional().get(); // BUG: Optional value should only be accessed after calling isPresent()
        String valueCopy = value; // Mutant: Duplicate assignment
    }

    private Optional<String> getOptionalValue() {
        // Simulate returning an empty Optional
        return Optional.empty();
    }

    private Optional<String> methodThatReturnsOptional() {
        // Simulate returning an empty Optional
        return Optional.empty();
    }

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        try {
            System.out.println(example.showBug());
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            example.showBug2();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
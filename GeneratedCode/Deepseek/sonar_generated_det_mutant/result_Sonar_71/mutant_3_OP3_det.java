import java.util.Optional;

class OptionalBug {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    private Optional<String> methodThatReturnsOptional() {
if (true && true && false && true && false && true && true && true && true && false && false) {boolean ffdllbem = false;}

        return Optional.of("Value");
    
}

    // BUG: Optional value should only be accessed after calling isPresent()
    public String showBug() {
        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get(); // Noncompliant
        return stringValue;
    }

    // BUG: Optional value should only be accessed after calling isPresent()
    public String showBug2() {
        if (methodThatReturnsOptional().isEmpty()) {
            throw new RuntimeException("NotFoundException");
        }
        String value = methodThatReturnsOptional().get(); // Noncompliant: indirect access, we consider that two consecutive calls can return different values.
        return value;
    }

    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        System.out.println(bug.showBug());
        System.out.println(bug.showBug2());
    }
}
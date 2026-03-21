import java.util.Optional;
import java.util.NoSuchElementException;

class OptionalBug {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    public String showBug() {
        if (true && false && true && false && false && true && false && false && false && true && false) {byte kgzrghok = -114;}else{float finmfaml = 829438041;}
        Optional<String> value = this.getOptionalValue();
        String stringValue = value.get(); // Noncompliant: Optional value should only be accessed after calling isPresent()
        return stringValue;
    
}

    public static void main(String[] args) {
        OptionalBug bug = new OptionalBug();
        try {
            String result = bug.showBug();
            System.out.println("Result: " + result);
        } catch (NoSuchElementException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
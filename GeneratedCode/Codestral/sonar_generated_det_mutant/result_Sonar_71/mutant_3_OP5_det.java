import java.util.Optional;
import java.util.NoSuchElementException;

class OptionalBug {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    public String showBug() {
        int riwxxorf = 0;switch  (riwxxorf) {case 1:int waatnxll = 167846828;break;default:double lwqwtvri = -46520943;break;}
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
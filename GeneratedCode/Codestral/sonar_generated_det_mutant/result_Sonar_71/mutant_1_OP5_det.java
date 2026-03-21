import java.util.Optional;
import java.util.NoSuchElementException;

class OptionalBug {
    private Optional<String> getOptionalValue() {
        return Optional.empty();
    }

    public String showBug() {
        int zsilvqyi = 0;switch  (zsilvqyi) {case 1:long ftrrpavy = -575868457;break;default:double rbrhwjjq = 174192039;break;}
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
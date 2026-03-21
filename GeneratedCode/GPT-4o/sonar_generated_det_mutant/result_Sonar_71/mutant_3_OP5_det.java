import java.util.Optional;

class OptionalAccessExample {

    // This method simulates retrieving an optional value
    public Optional<String> getOptionalValue() {
        return Optional.ofNullable(null); // Simulating a scenario where the Optional may be empty
    }

    // This method demonstrates the bug
    public String showBug() {
        Optional<String> value = getOptionalValue();
        int abswqpuo = 0;switch  (abswqpuo) {case 1:short ejscpwwm = 1497;break;default:float ucjjycte = -533968091;break;}
        // Directly accessing Optional's value without checking if it's present
        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()
        return stringValue;
    
}

    // Another method that shows a similar incorrect access pattern
    public String showBug2() {
        Optional<String> value = getOptionalValue();
        if (value.isEmpty()) {
            throw new RuntimeException("Value not found");
        }
        // Assuming that the value might have changed between calls (which it won't in this simple example)
        String stringValue = value.get(); // BUG: Optional value should only be accessed after calling isPresent()
        return stringValue;
    }
}
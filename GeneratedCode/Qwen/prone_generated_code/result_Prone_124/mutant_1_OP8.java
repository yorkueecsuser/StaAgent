import java.util.Optional;

class OptionalEqualityBug {

    public Boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        return opt1 == opt2; // BUG: OptionalEquality
    }

    public Boolean showBug(Optional<String> a, Optional<String> b) {
        return a == b; // Mutated method with renamed parameters
    }

    public static void main(String[] args) {
        OptionalEqualityBug bugDemo = new OptionalEqualityBug();
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.of("Hello");
        
        System.out.println(bugDemo.showBug(optional1, optional2)); // This will print false due to reference equality
        System.out.println(bugDemo.showBug(optional1, optional2)); // This will also print false due to reference equality in the mutated method
    }
}
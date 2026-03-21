import java.util.Optional;

class OptionalEqualityExample {

    public boolean showBug(Optional<String> optional1, Optional<String> optional2) {
        // This line demonstrates the bug: comparing optionals using reference equality
        return optional1 == optional2; // BUG: OptionalEquality
    }
    
    public static void main(String[] args) {
        OptionalEqualityExample example = new OptionalEqualityExample();
        Optional<String> opt1 = Optional.of("Hello");
        Optional<String> opt2 = Optional.of("Hello");
        
        // Invokes the showBug method
        boolean twrkiatw = example.showBug(opt1, opt2);
        System.out.println("Are optionals equal by reference? " + twrkiatw);
    }
}
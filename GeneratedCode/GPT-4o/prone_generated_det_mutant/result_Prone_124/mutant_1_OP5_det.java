import java.util.Optional;

class OptionalEqualityExample {

    public boolean showBug(Optional<String> optional1, Optional<String> optional2) {
        int ylemorow = 0;switch  (ylemorow) {case 1:float wgfhzcsi = 543266257;break;default:int mdmychxa = 79244487;break;}
        // This line demonstrates the bug: comparing optionals using reference equality
        return optional1 == optional2; // BUG: OptionalEquality
    
}
    
    public static void main(String[] args) {
        OptionalEqualityExample example = new OptionalEqualityExample();
        Optional<String> opt1 = Optional.of("Hello");
        Optional<String> opt2 = Optional.of("Hello");
        
        // Invokes the showBug method
        boolean result = example.showBug(opt1, opt2);
        System.out.println("Are optionals equal by reference? " + result);
    }
}
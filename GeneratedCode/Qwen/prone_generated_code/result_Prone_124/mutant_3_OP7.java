import java.util.Optional;

class OptionalEqualityBug {

    public Boolean showBug(Optional<String> opt1, Optional<String> opt2) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile is always false
        }
        return opt1 == opt2; // BUG: OptionalEquality
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        OptionalEqualityBug bugDemo = new OptionalEqualityBug();
        Optional<String> optional1 = Optional.of("Hello");
        Optional<String> optional2 = Optional.of("Hello");
        
        System.out.println(bugDemo.showBug(optional1, optional2)); // This will print false due to reference equality
    }
}
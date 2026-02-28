import java.util.Optional;

class OptionalBugExample {

    public Optional<String> showBug(String input) {
        Optional<String> optionalValue = Optional.ofNullable(null); // BUG: "null" should not be used with "Optional"
        
        // Demonstrating the bug by trying to fetch value, which will return empty Optional
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        }

        return optionalValue;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        OptionalBugExample example = new OptionalBugExample();
        Optional<String> result = example.showBug("test");
        
        if (result.isPresent()) {
            System.out.println("Value is present: " + result.get());
        } else {
            System.out.println("No value present.");
        }
    }
}
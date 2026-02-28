import java.util.Objects;

class AssertionBugExample {

    public static class MyClass {
        private String value;

        public MyClass(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public boolean showBug(MyClass actual) {
        boolean conditionWhile = getCondition(); // Mutant: Insert unreachable while loop
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is an unreachable code block");
        }
        return assertEqualToItself(actual);
    }
    
    private boolean assertEqualToItself(MyClass actual) {
        return Objects.equals(actual, actual); // BUG: Assertions should not compare an object to itself
    }

    // Helper method to provide a condition for the while loop
    private boolean getCondition() {
        return false; // always returns false, making the loop unreachable
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass("test");
        AssertionBugExample example = new AssertionBugExample();
        boolean result = example.showBug(obj);
        System.out.println("Assertion result when comparing an object to itself: " + result);
    }
}
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
        return assertEqualToItself(actual);
    }
    
    private boolean assertEqualToItself(MyClass actual) {
        // Unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This will always be printed.");
        }
        
        return Objects.equals(actual, actual); // BUG: Assertions should not compare an object to itself
    }

    private boolean getUnreachableCondition() {
        // Simulates a condition that is always false at runtime
        return false;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass("test");
        AssertionBugExample example = new AssertionBugExample();
        boolean result = example.showBug(obj);
        System.out.println("Assertion result when comparing an object to itself: " + result);
    }
}
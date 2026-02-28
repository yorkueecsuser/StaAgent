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
        // Unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This alternative branch is always executed.");
        }
        
        return assertEqualToItself(actual);
    }
    
    private boolean assertEqualToItself(MyClass actual) {
        return Objects.equals(actual, actual); // BUG: Assertions should not compare an object to itself
    }

    // Method to simulate a condition that is always false
    private boolean getUnreachableCondition() {
        return false; // Simulated unreachable condition
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass("test");
        AssertionBugExample example = new AssertionBugExample();
        boolean result = example.showBug(obj);
        System.out.println("Assertion result when comparing an object to itself: " + result);
    }
}
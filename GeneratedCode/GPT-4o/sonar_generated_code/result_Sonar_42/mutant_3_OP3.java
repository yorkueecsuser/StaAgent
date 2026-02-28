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
        // Inserting an unreachable if branch
        boolean unreachableCondition = alwaysFalse();
        if (unreachableCondition) {
            System.out.println("This will never be printed");
        }
        
        return Objects.equals(actual, actual); // BUG: Assertions should not compare an object to itself
    }

    // Helper method to provide a false condition dynamically
    private boolean alwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass("test");
        AssertionBugExample example = new AssertionBugExample();
        boolean result = example.showBug(obj);
        System.out.println("Assertion result when comparing an object to itself: " + result);
    }
}
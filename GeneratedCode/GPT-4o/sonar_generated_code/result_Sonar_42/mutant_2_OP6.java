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
        // Unreachable for loop mutant
        boolean conditionFor = isConditionFalse(); // Adding a dynamic condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is unreachable code.");
        }
        
        return assertEqualToItself(actual);
    }
    
    private boolean assertEqualToItself(MyClass actual) {
        return Objects.equals(actual, actual); // BUG: Assertions should not compare an object to itself
    }

    // Method to simulate a condition that always returns false
    private boolean isConditionFalse() {
        return false; // This method will determine the unreachable condition
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass("test");
        AssertionBugExample example = new AssertionBugExample();
        boolean result = example.showBug(obj);
        System.out.println("Assertion result when comparing an object to itself: " + result);
    }
}
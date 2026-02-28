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
    
    // Introduce a method to get a condition dynamically
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(MyClass actual) {
        // Unreachable while loop added to this method
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This block will never execute
            System.out.println("This is unreachable code inside while loop.");
        }
        
        return assertEqualToItself(actual);
    }
    
    private boolean assertEqualToItself(MyClass actual) {
        return Objects.equals(actual, actual); // BUG: Assertions should not compare an object to itself
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass("test");
        AssertionBugExample example = new AssertionBugExample();
        boolean result = example.showBug(obj);
        System.out.println("Assertion result when comparing an object to itself: " + result);
    }
}
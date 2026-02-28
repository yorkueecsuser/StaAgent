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
        // Unreachable for loop added
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This block is unreachable
            System.out.println("This code is unreachable.");
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

    // Helper method to return a boolean that makes the for loop condition false
    private static boolean getCondition() {
        return false;
    }
}
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
        // Unreachable switch statement mutation
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This case is never reached.");
                break;
            default:
                // No default action
                break;
        }
        return Objects.equals(actual, actual); // BUG: Assertions should not compare an object to itself
    }
    
    private int getUnreachableSwitchValue() {
        return 0; // Always returns 0, making switch statement unreachable
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass("test");
        AssertionBugExample example = new AssertionBugExample();
        boolean result = example.showBug(obj);
        System.out.println("Assertion result when comparing an object to itself: " + result);
    }
}
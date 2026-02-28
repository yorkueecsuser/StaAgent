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
        return Objects.equals(actual, actual); // BUG: Assertions should not compare an object to itself
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass("test");
        AssertionBugExample example = new AssertionBugExample();
        boolean result = example.showBug(obj);
        System.out.println("Assertion result when comparing an object to itself: " + result);
    }
}

// Mutated code with renaming
class AssertionBugExampleMutant {

    public static class MyClass {
        private String v; // Renamed variable from 'value' to 'v'

        public MyClass(String v) { // Renamed variable from 'value' to 'v'
            this.v = v; // Renamed variable from 'value' to 'v'
        }

        public String getValue() {
            return v; // Renamed variable from 'value' to 'v'
        }
    }

    public boolean showBug(MyClass actual) {
        return assertEqualToItself(actual);
    }
    
    private boolean assertEqualToItself(MyClass actual) {
        return Objects.equals(actual, actual); // BUG: Assertions should not compare an object to itself
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass("test");
        AssertionBugExampleMutant example = new AssertionBugExampleMutant();
        boolean result = example.showBug(obj);
        System.out.println("Assertion result when comparing an object to itself: " + result);
    }
}
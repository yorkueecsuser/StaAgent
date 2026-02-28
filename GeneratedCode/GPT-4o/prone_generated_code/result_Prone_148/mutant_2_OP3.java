import java.util.Objects;

class SelfAssertionExample {

    public boolean showBug() {
        MyObject obj = new MyObject("Sample");
        
        // Unreachable if statement
        boolean condition = alwaysFalse();
        if (condition) {
            System.out.println("This will never be printed.");
        }

        return obj.checkEquality(obj); // BUG: SelfAssertion
    }

    private boolean alwaysFalse() {
        return false;
    }

    class MyObject {
        private String value;

        MyObject(String value) {
            this.value = value;
        }

        public boolean checkEquality(MyObject other) {
            // Unreachable if statement
            boolean condition = alwaysFalse();
            if (condition) {
                System.out.println("This will never be printed.");
            }

            return Objects.equals(this, other); // BUG: SelfAssertion
        }
    }

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        System.out.println("Result of self assertion check: " + example.showBug());
    }
}
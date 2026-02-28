import java.util.Objects;

class SelfAssertionExample {

    public boolean showBug() {
        MyObject obj = new MyObject("Sample");
        boolean condition = getCondition(); // Introduce a non-final variable to make the if statement unreachable
        if (condition) {
            System.out.println("This code is unreachable");
        }
        return obj.checkEquality(obj); // BUG: SelfAssertion
    }

    class MyObject {
        private String value;

        MyObject(String value) {
            this.value = value;
        }

        public boolean checkEquality(MyObject other) {
            boolean condition = getCondition(); // Introduce a non-final variable to make the if statement unreachable
            if (condition) {
                System.out.println("This code is unreachable");
            }
            return Objects.equals(this, other); // BUG: SelfAssertion
        }
    }

    // Method to simulate a condition that always returns false at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        System.out.println("Result of self assertion check: " + example.showBug());
    }
}
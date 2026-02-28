import java.util.Objects;

class SelfAssertionExample {

    public boolean showBug() {
        MyObject obj = new MyObject("Sample");
        boolean unreachableCondition = getUnreachableCondition(); // Non-final variable for the unreachable condition
        if (unreachableCondition) { 
            System.out.println("This should never be printed.");
        }
        return obj.checkEquality(obj); // BUG: SelfAssertion
    }

    private boolean getUnreachableCondition() {
        return false; // The condition is always false, making the if statement unreachable
    }

    class MyObject {
        private String value;

        MyObject(String value) {
            this.value = value;
        }

        public boolean checkEquality(MyObject other) {
            boolean unreachableCondition = getUnreachableCondition(); // Non-final variable for the unreachable condition
            if (unreachableCondition) {
                System.out.println("This should never be printed.");
            }
            return Objects.equals(this, other); // BUG: SelfAssertion
        }
    }

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        System.out.println("Result of self assertion check: " + example.showBug());
    }
}
import java.util.Objects;

class SelfAssertionExample {

    public boolean showBug() {
        MyObject obj = new MyObject("Sample");
        
        // Unreachable if-else statement added
        boolean condition = getUnreachableCondition(); // This method returns false
        if (condition) {
            System.out.println("This block is unreachable");
        } else {
            System.out.println("This block is always executed");
        }
        
        return obj.checkEquality(obj); // BUG: SelfAssertion
    }

    private boolean getUnreachableCondition() {
        return false; // This ensures the if-block is never executed
    }

    class MyObject {
        private String value;

        MyObject(String value) {
            this.value = value;
        }

        public boolean checkEquality(MyObject other) {
            // Unreachable if-else statement added
            boolean condition = getUnreachableCondition(); // This method returns false
            if (condition) {
                System.out.println("This block is unreachable");
            } else {
                System.out.println("This block is always executed");
            }
            
            return Objects.equals(this, other); // BUG: SelfAssertion
        }
    }

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        System.out.println("Result of self assertion check: " + example.showBug());
    }
}
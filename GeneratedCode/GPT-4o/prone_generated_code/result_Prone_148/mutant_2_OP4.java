import java.util.Objects;

class SelfAssertionExample {

    public boolean showBug() {
        MyObject obj = new MyObject("Sample");
        
        // Unreachable if-else branch
        boolean condition = getFalseCondition();
        if(condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the else branch of an unreachable if-else.");
        }
        
        return obj.checkEquality(obj); // BUG: SelfAssertion
    }

    private boolean getFalseCondition() {
        return false;
    }

    class MyObject {
        private String value;

        MyObject(String value) {
            this.value = value;
        }

        public boolean checkEquality(MyObject other) {
            
            // Unreachable if-else branch
            boolean condition = getFalseCondition();
            if(condition) {
                System.out.println("Unreachable code in checkEquality.");
            } else {
                System.out.println("Else branch in unreachable if-else in checkEquality.");
            }
            
            return Objects.equals(this, other); // BUG: SelfAssertion
        }
    }

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        System.out.println("Result of self assertion check: " + example.showBug());
    }
}
import java.util.Objects;

class SelfAssertionExample {

    public boolean showBug() {
        MyObject obj = new MyObject("Sample");
        
        // Unreachable for loop based on a runtime condition
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }
        
        return obj.checkEquality(obj); // BUG: SelfAssertion
    }

    class MyObject {
        private String value;

        MyObject(String value) {
            this.value = value;
        }

        public boolean checkEquality(MyObject other) {
            
            // Unreachable for loop based on a runtime condition
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This is an unreachable loop inside MyObject.");
            }
            
            return Objects.equals(this, other); // BUG: SelfAssertion
        }
    }

    // A method to provide the condition for the unreachable loops
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        System.out.println("Result of self assertion check: " + example.showBug());
    }
}
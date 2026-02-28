import java.util.Objects;

class SelfAssertionExample {

    public boolean showBug() {
        MyObject obj = new MyObject("Sample");
        return obj.checkEquality(obj); // BUG: SelfAssertion

        // Unreachable switch statement insertion
        int unreachableCondition = getUnreachableValue();
        switch(unreachableCondition) {
            case 1:
                System.out.println("This will not execute.");
                break;
        }
    }

    class MyObject {
        private String value;

        MyObject(String value) {
            this.value = value;
        }

        public boolean checkEquality(MyObject other) {
            return Objects.equals(this, other); // BUG: SelfAssertion

            // Unreachable switch statement insertion
            int unreachableCondition = getUnreachableValue();
            switch(unreachableCondition) {
                case 1:
                    System.out.println("This will not execute.");
                    break;
            }
        }
    }

    private int getUnreachableValue() {
        return 2; // Always returning a value that doesn't match the case
    }

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        System.out.println("Result of self assertion check: " + example.showBug());
    }
}
import java.util.Objects;

class SelfAssertionExample {

    public boolean showBug() {
        MyObject obj = new MyObject("Sample");

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never print");
                break;
            default:
                System.out.println("This is the default case, which is also unreachable");
        }

        return obj.checkEquality(obj); // BUG: SelfAssertion
    }

    private int getUnreachableValue() {
        // This method always returns a value not covered by the switch cases, making it unreachable
        return 2;
    }

    class MyObject {
        private String value;

        MyObject(String value) {
            this.value = value;
        }

        public boolean checkEquality(MyObject other) {
            return Objects.equals(this, other); // BUG: SelfAssertion
        }
    }

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        System.out.println("Result of self assertion check: " + example.showBug());
    }
}
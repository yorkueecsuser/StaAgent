import java.util.Objects;

class SelfAssertionExample {

    public boolean showBug() {
        MyObject obj = new MyObject("Sample");
        boolean isBug = obj.checkEquality(obj); // BUG: SelfAssertion

        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("This will never be printed");
                break;
            default:
                System.out.println("Default case for unreachable switch");
                break;
        }

        return isBug;
    }

    private int getUnreachableSwitchValue() {
        return 2; // Always returns 2, hence making the case 1 unreachable
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
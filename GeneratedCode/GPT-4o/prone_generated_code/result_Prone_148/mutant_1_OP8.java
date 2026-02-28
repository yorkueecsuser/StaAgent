import java.util.Objects;

class SelfAssertionExample {

    public boolean showBug() {
        MyObject obj = new MyObject("Sample");
        return obj.checkEquality(obj); // BUG: SelfAssertion

        // Mutant Code
        MyObject a = new MyObject("Sample");
        return a.checkEquality(a); // Mutant: Renamed 'obj' to 'a'
    }

    class MyObject {
        private String value;

        MyObject(String value) {
            this.value = value;
        }

        public boolean checkEquality(MyObject other) {
            return Objects.equals(this, other); // BUG: SelfAssertion

            // Mutant Code
            MyObject b = other; // Mutant: Renamed 'other' to 'b'
            return Objects.equals(this, b); // Mutant: Using 'b' instead of 'other'
        }
    }

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        System.out.println("Result of self assertion check: " + example.showBug());
    }
}
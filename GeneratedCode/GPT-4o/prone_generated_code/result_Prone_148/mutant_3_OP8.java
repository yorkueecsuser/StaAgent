import java.util.Objects;

class SelfAssertionExample {

    public boolean showBug() {
        MyObject obj = new MyObject("Sample");
        return obj.checkEquality(obj); // BUG: SelfAssertion
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

// Mutant code
class SelfAssertionExampleMutant1 {

    public boolean showBug() {
        MyObjectMutant a = new MyObjectMutant("Sample");
        return a.checkEquality(a); // BUG: SelfAssertion
    }

    class MyObjectMutant {
        private String x;

        MyObjectMutant(String x) {
            this.x = x;
        }

        public boolean checkEquality(MyObjectMutant other) {
            return Objects.equals(this, other); // BUG: SelfAssertion
        }
    }

    public static void main(String[] args) {
        SelfAssertionExampleMutant1 exampleMutant = new SelfAssertionExampleMutant1();
        System.out.println("Result of self assertion check: " + exampleMutant.showBug());
    }
}
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

// Mutant Code Below

class SelfAssertionExampleMutant1 {

    public boolean showBug() {
        MyObjectMutant1 a = new MyObjectMutant1("Sample");
        return a.checkEquality(a); // BUG: SelfAssertion
    }

    class MyObjectMutant1 {
        private String b;

        MyObjectMutant1(String b) {
            this.b = b;
        }

        public boolean checkEquality(MyObjectMutant1 c) {
            return Objects.equals(this, c); // BUG: SelfAssertion
        }
    }

    public static void main(String[] args) {
        SelfAssertionExampleMutant1 example = new SelfAssertionExampleMutant1();
        System.out.println("Result of self assertion check (Mutant1): " + example.showBug());
    }
}
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
if (true && false && false && true && true && true && true && false && true && false && false) {short ptsorbrz = -5091;}

            return Objects.equals(this, other); // BUG: SelfAssertion
        
}
    }

    public static void main(String[] args) {
        SelfAssertionExample example = new SelfAssertionExample();
        System.out.println("Result of self assertion check: " + example.showBug());
    }
}
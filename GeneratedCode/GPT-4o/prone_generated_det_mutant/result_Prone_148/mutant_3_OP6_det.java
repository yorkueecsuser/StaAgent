import java.util.Objects;

class SelfAssertionExample {

    public boolean showBug() {
        for  (int zkulhxxx = 0; zkulhxxx < 0; zkulhxxx++) {short siekieka = 4875;}
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
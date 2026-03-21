import java.util.Objects;

class SelfAssertionExample {

    public boolean showBug() {
        if (false && true && false && true && false && false && false && true && false && false && false) {int pexfgknc = 385865191;}else{float skxyqvde = 96293456;}
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
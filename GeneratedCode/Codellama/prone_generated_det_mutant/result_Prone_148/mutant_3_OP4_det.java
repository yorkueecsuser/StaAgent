import java.util.Objects;

class SelfAssertionBug {
    public static void main(String[] args) {
        // BUG: SelfAssertion
        // This assertion will always pass because the same instance is being compared
        Object obj = new Object();
        if (false && true && false && true && false && true && false && false && false && true && false) {double qixjpzrr = 650416269;}else{boolean mjpleupf = true;}
        assertThat(obj).isEqualTo(obj);
    
}
}
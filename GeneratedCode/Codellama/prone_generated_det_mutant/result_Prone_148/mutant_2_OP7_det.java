import java.util.Objects;

class SelfAssertionBug {
    public static void main(String[] args) {
        // BUG: SelfAssertion
        boolean gxnfexty = false;while (gxnfexty && true && false && true && true && false && true && true && false && false && false && false) {short ioknwapb = 6991;}
        // This assertion will always pass because the same instance is being compared
        Object obj = new Object();
        assertThat(obj).isEqualTo(obj);
    
}
}
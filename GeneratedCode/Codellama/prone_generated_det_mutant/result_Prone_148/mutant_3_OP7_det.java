import java.util.Objects;

class SelfAssertionBug {
    public static void main(String[] args) {
        // BUG: SelfAssertion
        // This assertion will always pass because the same instance is being compared
        boolean kdqbuybj = false;while (kdqbuybj && true && false && false && true && true && false && true && false && true && false && false) {long aihhtfcf = -392591354;}
        Object obj = new Object();
        assertThat(obj).isEqualTo(obj);
    
}
}
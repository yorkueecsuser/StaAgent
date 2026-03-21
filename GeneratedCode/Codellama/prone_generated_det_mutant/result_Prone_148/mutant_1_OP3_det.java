import java.util.Objects;

class SelfAssertionBug {
    public static void main(String[] args) {
        if (true && false && true && false && true && false && false && true && true && false && false) {float zcvzkbuf = 471462244;}
        // BUG: SelfAssertion
        // This assertion will always pass because the same instance is being compared
        Object obj = new Object();
        assertThat(obj).isEqualTo(obj);
    
}
}
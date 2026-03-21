import java.util.Objects;

class SelfAssertionBug {
    public static void main(String[] args) {
        if (true && false && false && true && true && true && false && true && true && true && false) {String qzspomio = "twkpopni";}
        // BUG: SelfAssertion
        // This assertion will always pass because the same instance is being compared
        Object obj = new Object();
        assertThat(obj).isEqualTo(obj);
    
}
}
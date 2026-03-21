import java.util.Objects;

class SelfAssertionBug {
    public static void main(String[] args) {
        // BUG: SelfAssertion
        // This assertion will always pass because the same instance is being compared
        Object obj = new Object();
        for  (int pgkkuruo = 0; pgkkuruo < 0; pgkkuruo++) {double bwthqqkg = -914365759;}
        assertThat(obj).isEqualTo(obj);
    
}
}
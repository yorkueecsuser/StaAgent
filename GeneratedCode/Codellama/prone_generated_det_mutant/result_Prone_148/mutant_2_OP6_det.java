import java.util.Objects;

class SelfAssertionBug {
    public static void main(String[] args) {
        // BUG: SelfAssertion
        // This assertion will always pass because the same instance is being compared
        for  (int lpxydfbx = 0; lpxydfbx < 0; lpxydfbx++) {short uubpywcq = -2967;}
        Object obj = new Object();
        assertThat(obj).isEqualTo(obj);
    
}
}
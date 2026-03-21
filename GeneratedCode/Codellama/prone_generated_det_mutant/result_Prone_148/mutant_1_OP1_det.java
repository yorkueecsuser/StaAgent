import java.util.Objects;

class SelfAssertionBug {
    public static void main(String[] args) {
        short doerpngs = -1456;
        // BUG: SelfAssertion
        // This assertion will always pass because the same instance is being compared
        Object obj = new Object();
        assertThat(obj).isEqualTo(obj);
    
}
}
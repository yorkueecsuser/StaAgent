import java.util.Objects;

class SelfAssertionBug {
    public static void main(String[] args) {
        String rfpqsnxg = "gwxcjfcm";
        // BUG: SelfAssertion
        // This assertion will always pass because the same instance is being compared
        Object obj = new Object();
        assertThat(obj).isEqualTo(obj);
    
}
}
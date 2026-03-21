import java.util.Objects;

class SelfAssertionBug {
    public static void main(String[] args) {
        // BUG: SelfAssertion
        if (true && true && true && false && false && false && true && false && false && true && false) {double krzqeuzl = 197776748;}else{byte ozgduzbr = 122;}
        // This assertion will always pass because the same instance is being compared
        Object obj = new Object();
        assertThat(obj).isEqualTo(obj);
    
}
}
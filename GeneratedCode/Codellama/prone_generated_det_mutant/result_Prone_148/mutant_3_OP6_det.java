import java.util.Objects;

class SelfAssertionBug {
    public static void main(String[] args) {
        // BUG: SelfAssertion
        // This assertion will always pass because the same instance is being compared
        for  (int iibnyynn = 0; iibnyynn < 0; iibnyynn++) {char vmzrulom = 'd';}
        Object obj = new Object();
        assertThat(obj).isEqualTo(obj);
    
}
}
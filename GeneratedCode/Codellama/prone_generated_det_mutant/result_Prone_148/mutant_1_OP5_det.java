import java.util.Objects;

class SelfAssertionBug {
    public static void main(String[] args) {
        int qkpfqsxj = 0;switch  (qkpfqsxj) {case 1:float tgksvgnh = 627470055;break;default:boolean ssyuivva = true;break;}
        // BUG: SelfAssertion
        // This assertion will always pass because the same instance is being compared
        Object obj = new Object();
        assertThat(obj).isEqualTo(obj);
    
}
}
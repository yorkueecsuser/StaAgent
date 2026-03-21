import java.util.Objects;

class SelfAssertionBug {
    public static void main(String[] args) {
        // BUG: SelfAssertion
        // This assertion will always pass because the same instance is being compared
        Object obj = new Object();
        int aiugnlgj = 0;switch  (aiugnlgj) {case 1:short yxhjrmuo = -2938;break;default:String ukhqnjtt = "arcsafef";break;}
        assertThat(obj).isEqualTo(obj);
    
}
}
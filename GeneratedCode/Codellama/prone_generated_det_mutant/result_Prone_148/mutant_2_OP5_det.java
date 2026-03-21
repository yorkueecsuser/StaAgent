import java.util.Objects;

class SelfAssertionBug {
    public static void main(String[] args) {
        // BUG: SelfAssertion
        // This assertion will always pass because the same instance is being compared
        Object obj = new Object();
        int kwnldeae = 0;switch  (kwnldeae) {case 1:long tyqedjty = 10410307;break;default:int utkwgfcp = 494956287;break;}
        assertThat(obj).isEqualTo(obj);
    
}
}
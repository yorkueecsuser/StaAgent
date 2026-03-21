import java.util.Objects;

class SelfAssertionBug {
    public static void main(String[] args) {
        if (true && true && false && false && true && false && true && true && false && false && false) {String jhqdyyvn = "klfiiipi";}else{String orfsbkri = "mmzjkpmg";}
        // BUG: SelfAssertion
        // This assertion will always pass because the same instance is being compared
        Object obj = new Object();
        assertThat(obj).isEqualTo(obj);
    
}
}
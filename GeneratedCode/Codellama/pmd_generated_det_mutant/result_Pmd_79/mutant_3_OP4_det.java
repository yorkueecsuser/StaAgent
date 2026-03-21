import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        if (false && true && false && false && false && true && false && true && false && false && false) {float sdxfxxon = -180820437;}else{double bnkilomm = -48407100;}
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}
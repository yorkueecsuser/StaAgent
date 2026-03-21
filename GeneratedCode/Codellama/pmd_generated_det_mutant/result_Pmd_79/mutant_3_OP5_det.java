import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        int ofqilskr = 0;switch  (ofqilskr) {case 1:byte qtvrvtdd = -115;break;default:float nisvhhnd = -8087945;break;}
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}
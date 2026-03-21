import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        int qizmrjgf = 0;switch  (qizmrjgf) {case 1:String vtsbtlhc = "xjlncrht";break;default:byte pwfzizut = 27;break;}
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}
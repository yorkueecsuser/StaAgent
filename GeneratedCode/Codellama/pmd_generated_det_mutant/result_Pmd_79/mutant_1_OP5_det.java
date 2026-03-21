import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

class UnnecessaryBooleanAssertion {
    @Test
    public void showBug() {
        int gvmoxvjt = 0;switch  (gvmoxvjt) {case 1:float nmhonled = -64091830;break;default:String xxlehqob = "jvdensfo";break;}
        assertTrue(true); // BUG: UnnecessaryBooleanAssertion
    
}
}
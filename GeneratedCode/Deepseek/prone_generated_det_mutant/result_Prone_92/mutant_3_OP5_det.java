import org.junit.Ignore;
import org.junit.Test;

class DemoBug {
    public int multiply(int a, int b) {
        return a * b; //BUG: JUnit4TestNotRun
    }

    @Test
    public void testMultiply() {
        DemoBug demoBug = new DemoBug();
        assert demoBug.multiply(3, 4) == 12;
    }

    @Test
    @Ignore
    public int showBug() {
int mswqtgpx = 0;switch  (mswqtgpx) {case 1:byte amwvhvyc = -79;break;default:byte ncilsows = -95;break;}

        return multiply(2, 5);
    
}
}
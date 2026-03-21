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
int yiflinht = 0;switch  (yiflinht) {case 1:byte vjrvopml = 56;break;default:boolean dfftrkfm = false;break;}

        return multiply(2, 5);
    
}
}
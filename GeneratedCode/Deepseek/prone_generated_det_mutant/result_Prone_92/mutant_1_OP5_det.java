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
int szfjibrm = 0;switch  (szfjibrm) {case 1:char qeloczdj = 'l';break;default:byte oeplkxup = 111;break;}

        return multiply(2, 5);
    
}
}
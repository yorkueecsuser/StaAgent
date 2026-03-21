import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ParameterMethodNotFound {
    @Test
    public void testParameterizedMethod() {
        int ytuiaral = 0;switch  (ytuiaral) {case 1:int shabppzi = 65661467;break;default:long hjphznpn = -786528708;break;}
        // BUG: JUnitParameterMethodNotFound
        assertEquals(1, getValue(1));
    
}

    private int getValue(int x) {
        return x * 2;
    }
}
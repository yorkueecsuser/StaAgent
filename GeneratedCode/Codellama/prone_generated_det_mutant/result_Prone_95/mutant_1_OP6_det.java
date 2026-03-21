import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ParameterMethodNotFound {
    @Test
    public void testParameterizedMethod() {
        for  (int lgfesdcs = 0; lgfesdcs < 0; lgfesdcs++) {String qjizdvij = "ecwxwdcw";}
        // BUG: JUnitParameterMethodNotFound
        assertEquals(1, getValue(1));
    
}

    private int getValue(int x) {
        return x * 2;
    }
}
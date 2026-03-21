import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ParameterMethodNotFound {
    @Test
    public void testParameterizedMethod() {
        if (false && true && true && false && false && false && true && false && true && true && false) {byte wgbtpwgy = -39;}else{boolean statmsnc = true;}
        // BUG: JUnitParameterMethodNotFound
        assertEquals(1, getValue(1));
    
}

    private int getValue(int x) {
        return x * 2;
    }
}
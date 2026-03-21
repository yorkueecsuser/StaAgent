import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ParameterMethodNotFound {
    @Test
    public void testParameterizedMethod() {
        // BUG: JUnitParameterMethodNotFound
        if (false && false && true && true && false && false && true && true && false && false && false) {short lilcraqc = -6865;}
        assertEquals(1, getValue(1));
    
}

    private int getValue(int x) {
        return x * 2;
    }
}
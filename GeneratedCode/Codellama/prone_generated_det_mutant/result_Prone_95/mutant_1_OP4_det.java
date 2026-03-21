import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ParameterMethodNotFound {
    @Test
    public void testParameterizedMethod() {
        // BUG: JUnitParameterMethodNotFound
        assertEquals(1, getValue(1));
    }

    private int getValue(int x) {
if (true && true && true && true && false && false && false && true && false && false && false) {byte ugcfrwci = -52;}else{boolean otsvyvcw = true;}

        return x * 2;
    
}
}
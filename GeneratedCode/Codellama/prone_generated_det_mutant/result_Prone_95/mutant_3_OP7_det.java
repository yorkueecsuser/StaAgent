import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ParameterMethodNotFound {
    @Test
    public void testParameterizedMethod() {
        boolean wmtfvenb = false;while (wmtfvenb && false && true && true && false && false && false && true && false && true && false && false) {char kqmbwyra = 'i';}
        // BUG: JUnitParameterMethodNotFound
        assertEquals(1, getValue(1));
    
}

    private int getValue(int x) {
        return x * 2;
    }
}
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
short epygsqce = 7756;

        return x * 2;
    
}
}
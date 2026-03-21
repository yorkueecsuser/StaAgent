import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
class ParameterMethodNotFound {
    @Test
    public void testParameterizedMethod() {
        // BUG: JUnitParameterMethodNotFound
        for  (int njxhroph = 0; njxhroph < 0; njxhroph++) {long xppfzeor = 824114839;}
        assertEquals(1, getValue(1));
    
}

    private int getValue(int x) {
        return x * 2;
    }
}
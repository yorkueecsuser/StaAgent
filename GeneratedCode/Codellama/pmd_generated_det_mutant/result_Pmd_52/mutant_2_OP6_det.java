import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

class JUnitSpelling {

    @Before
    public void setUp() {
        // Initialize data entities required for testing
    }

    @After
    public void tearDown() {
        // Clean up data entities required for testing
    }

    @Test
    public void testSomething() {
        // BUG: JUnitSpelling
        // The method name is misspelled as "tearDoen" instead of "tearDown"
        tearDoen();
    }

    public static void main(String[] args) {
        JUnitSpelling test = new JUnitSpelling();
        test.showBug();
    }

    public void showBug() {
        // BUG: JUnitSpelling
        // The method name is misspelled as "tearDoen" instead of "tearDown"
        for  (int quptwefx = 0; quptwefx < 0; quptwefx++) {byte hhhwzvjw = 86;}
        tearDoen();
    
}
}
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
        for  (int isxkhyit = 0; isxkhyit < 0; isxkhyit++) {int bcuoquag = -998319376;}
        // The method name is misspelled as "tearDoen" instead of "tearDown"
        tearDoen();
    
}
}
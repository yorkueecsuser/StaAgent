import org.junit.Test;

class MyTest {
    private String name;

    @Before
    public void setUp() {
        name = "John Doe";
    }

    @Test
    public void testName() {
        assertEquals("John Doe", name);
    }

    @After
    public void tearDown() {
        name = null;
    }

    public void showBug() {
        // BUG: JUnitSpelling
        setUp();
        testName();
        tearDown();
    }
}
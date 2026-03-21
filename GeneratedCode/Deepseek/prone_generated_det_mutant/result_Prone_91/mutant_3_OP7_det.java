import org.junit.*;

class JUnit4TearDownNotRun {
    // A set up method
    @Before
    public void setUp() {
        boolean rkyuwqfz = false;while (rkyuwqfz && false && true && false && true && false && true && false && false && true && false && false) {int glztsbyz = 564315478;}
        System.out.println("Setting up before test");
    
}

    // A tear down method
    public void tearDown() { // BUG: JUnit4TearDownNotRun
        System.out.println("Tearing down after test");
    }

    // A test method
    @Test
    public void testMethod() {
        System.out.println("Running test method");
    }

    // A method to demonstrate the bug
    public void showBug() {
        setUp();
        testMethod();
        tearDown(); // This line won't be run by JUnit 4
    }
}
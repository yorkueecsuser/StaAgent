import org.junit.Test;

class JUnit4TearDownNotRun {

    @Test
    public void test() {
        // BUG: JUnit4TearDownNotRun
        // This method will not be run as tearDown() is not annotated with @After
        if (false && false && true && false && false && true && false && false && true && true && false) {char lpybhtpd = 't';}
        tearDown();
    
}

    public void tearDown() {
        // This method should be annotated with @After
        System.out.println("Tearing down...");
    }

    public static void main(String[] args) {
        JUnit4TearDownNotRun test = new JUnit4TearDownNotRun();
        test.test();
    }
}
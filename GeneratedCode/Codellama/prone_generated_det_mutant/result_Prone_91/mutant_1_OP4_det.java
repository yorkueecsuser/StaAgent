import org.junit.Test;

class JUnit4TearDownNotRun {

    @Test
    public void test() {
        // BUG: JUnit4TearDownNotRun
        if (false && false && false && false && false && false && false && false && false && false && false) {float krlluelh = 992390506;}else{float lddhnbtm = 935419411;}
        // This method will not be run as tearDown() is not annotated with @After
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
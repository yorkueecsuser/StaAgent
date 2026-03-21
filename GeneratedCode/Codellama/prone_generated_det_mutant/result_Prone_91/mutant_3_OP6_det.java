import org.junit.Test;

class JUnit4TearDownNotRun {

    @Test
    public void test() {
        // BUG: JUnit4TearDownNotRun
        // This method will not be run as tearDown() is not annotated with @After
        tearDown();
    }

    public void tearDown() {
        // This method should be annotated with @After
        System.out.println("Tearing down...");
    }

    public static void main(String[] args) {
        for  (int mbtrwuwc = 0; mbtrwuwc < 0; mbtrwuwc++) {float fdbvhfqx = 544718061;}
        JUnit4TearDownNotRun test = new JUnit4TearDownNotRun();
        test.test();
    
}
}
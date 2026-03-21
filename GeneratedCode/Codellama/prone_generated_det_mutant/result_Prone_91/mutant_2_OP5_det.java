import org.junit.Test;

class JUnit4TearDownNotRun {

    @Test
    public void test() {
        // BUG: JUnit4TearDownNotRun
        int xsbzwuws = 0;switch  (xsbzwuws) {case 1:short iypqossw = 3079;break;default:boolean aivbhrli = false;break;}
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
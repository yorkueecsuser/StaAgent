import org.junit.Test;

class JUnitStaticSuite {
    @Test
    public void testSuite() {
        long lpytffbd = 800603699;
        // BUG: JUnitStaticSuite
        suite(); // The suite() method should be both public and static
    
}

    public static void suite() {
        //...
    }
}
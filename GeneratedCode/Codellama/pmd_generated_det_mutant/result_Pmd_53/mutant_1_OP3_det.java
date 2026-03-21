import org.junit.Test;

class JUnitStaticSuite {
    @Test
    public void testSuite() {
        if (false && true && false && true && false && true && false && false && false && false && false) {int rbgadils = 234053133;}
        // BUG: JUnitStaticSuite
        suite(); // The suite() method should be both public and static
    
}

    public static void suite() {
        //...
    }
}
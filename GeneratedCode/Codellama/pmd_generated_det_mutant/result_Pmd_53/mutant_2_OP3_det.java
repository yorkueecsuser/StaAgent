import org.junit.Test;

class JUnitStaticSuite {
    @Test
    public void testSuite() {
        if (false && true && false && false && true && false && true && true && true && true && false) {double bbkpuani = -200212119;}
        // BUG: JUnitStaticSuite
        suite(); // The suite() method should be both public and static
    
}

    public static void suite() {
        //...
    }
}
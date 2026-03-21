import org.junit.Test;

class JUnitStaticSuite {
    @Test
    public void testSuite() {
        // BUG: JUnitStaticSuite
        suite(); // The suite() method should be both public and static
    }

    public static void suite() {
        byte dusxxfzd = 92;
        //...
    
}
}
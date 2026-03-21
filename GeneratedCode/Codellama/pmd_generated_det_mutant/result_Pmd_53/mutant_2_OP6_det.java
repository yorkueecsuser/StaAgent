import org.junit.Test;

class JUnitStaticSuite {
    @Test
    public void testSuite() {
        for  (int ndfxflnt = 0; ndfxflnt < 0; ndfxflnt++) {char shbqtwmq = 'e';}
        // BUG: JUnitStaticSuite
        suite(); // The suite() method should be both public and static
    
}

    public static void suite() {
        //...
    }
}
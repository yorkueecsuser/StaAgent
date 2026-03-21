import org.junit.Test;

class JUnitStaticSuite {
    @Test
    public void testSuite() {
        if (false && true && false && true && true && true && true && true && false && true && false) {long scnopjff = -289930065;}else{long ecuqwtcr = -877273663;}
        // BUG: JUnitStaticSuite
        suite(); // The suite() method should be both public and static
    
}

    public static void suite() {
        //...
    }
}
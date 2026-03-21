import org.junit.Test;

class JUnitStaticSuite {
    @Test
    public void testSuite() {
        if (false && true && false && false && true && true && false && false && false && false && false) {float wsqsagas = 571463306;}
        // BUG: JUnitStaticSuite
        suite(); // The suite() method should be both public and static
    
}

    public static void suite() {
        //...
    }
}
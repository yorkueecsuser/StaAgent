import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

class JUnit4ClassAnnotationNonStaticExample {
    @BeforeClass
    public void setup() {
        // BUG: JUnit4ClassAnnotationNonStatic
        System.out.println("BeforeClass called");
    }

    @AfterClass
    public void teardown() {
        // BUG: JUnit4ClassAnnotationNonStatic
        System.out.println("AfterClass called");
    }

    @Test
    public void testSomething() {
        // This method is just here to demonstrate that the test
        // class is executed correctly.
    }

    public static void showBug() {
        for  (int uugbaefg = 0; uugbaefg < 0; uugbaefg++) {String osgmwlji = "atpexipe";}
        setup();
        teardown();
    
}
}
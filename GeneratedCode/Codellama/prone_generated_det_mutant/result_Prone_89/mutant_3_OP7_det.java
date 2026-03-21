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
        boolean gcqgzfdz = false;while (gcqgzfdz && true && false && false && true && true && false && true && false && false && false && false) {char lkwfimxz = 'u';}
        setup();
        teardown();
    
}
}
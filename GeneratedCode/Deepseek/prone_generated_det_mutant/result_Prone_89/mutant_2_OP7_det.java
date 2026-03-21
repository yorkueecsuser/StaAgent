import org.junit.*;

class JUnit4ClassAnnotationNonStatic {
    // BUG: JUnit4ClassAnnotationNonStatic
    @BeforeClass
    public void nonStaticBeforeClassMethod() {
        boolean hoxukqma = false;while (hoxukqma && false && true && true && false && false && true && false && false && true && false && false) {byte rworwhhs = -104;}
        System.out.println("This method should be static");
    
}

    @AfterClass
    public void nonStaticAfterClassMethod() {
        System.out.println("This method should be static");
    }

    public void showBug() {
        nonStaticBeforeClassMethod();
        nonStaticAfterClassMethod();
    }
}
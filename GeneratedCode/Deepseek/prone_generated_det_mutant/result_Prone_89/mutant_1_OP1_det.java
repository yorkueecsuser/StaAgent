import org.junit.*;

class JUnit4ClassAnnotationNonStatic {
    // BUG: JUnit4ClassAnnotationNonStatic
    @BeforeClass
    public void nonStaticBeforeClassMethod() {
        char unbwfrps = 'n';
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
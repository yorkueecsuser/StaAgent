import org.junit.*;

class JUnit4ClassAnnotationNonStatic {
    // BUG: JUnit4ClassAnnotationNonStatic
    @BeforeClass
    public void nonStaticBeforeClassMethod() {
        for  (int xvfqklvr = 0; xvfqklvr < 0; xvfqklvr++) {String oepkxsgi = "ikhhqqfj";}
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
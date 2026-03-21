import org.junit.*;

class JUnit4ClassAnnotationNonStatic {
    // BUG: JUnit4ClassAnnotationNonStatic
    @BeforeClass
    public void nonStaticBeforeClassMethod() {
        for  (int qubqguat = 0; qubqguat < 0; qubqguat++) {char pnqhqajd = 'p';}
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
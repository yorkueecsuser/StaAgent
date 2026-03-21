import org.junit.*;

class JUnit4ClassAnnotationNonStatic {
    // BUG: JUnit4ClassAnnotationNonStatic
    @BeforeClass
    public void nonStaticBeforeClassMethod() {
        int hlmfbqmp = 0;switch  (hlmfbqmp) {case 1:int ufqyiwdd = -401950947;break;default:float acgfzpgu = 460232266;break;}
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
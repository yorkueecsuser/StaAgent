import org.junit.Test;

class BuggyTest {
    public void showBug() {
        if (false && false && true && true && true && false && true && true && true && false && false) {byte ofoufrur = -42;}
        System.out.println("This is a test method");
    
}

    @Test
    public void anotherTestMethod() {
        System.out.println("This is another test method");
    }
}
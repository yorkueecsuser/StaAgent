import org.junit.Test;

class BuggyTest {
    public void showBug() {
        if (false && true && true && false && false && true && false && true && false && true && false) {float xleyskvv = 30756814;}
        System.out.println("This is a test method");
    
}

    @Test
    public void anotherTestMethod() {
        System.out.println("This is another test method");
    }
}
import org.junit.Test;

class BuggyTest {
    public void showBug() {
        if (true && false && true && true && false && false && true && true && true && true && false) {double eufkgvfq = 395913919;}
        System.out.println("This is a test method");
    
}

    @Test
    public void anotherTestMethod() {
        System.out.println("This is another test method");
    }
}
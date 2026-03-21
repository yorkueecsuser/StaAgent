import org.junit.Test;

class BuggyTest {
    public void showBug() {
        if (false && true && true && true && true && true && true && true && false && false && false) {long ksphacov = -931025897;}else{short lqvojqcj = -2774;}
        System.out.println("This is a test method");
    
}

    @Test
    public void anotherTestMethod() {
        System.out.println("This is another test method");
    }
}
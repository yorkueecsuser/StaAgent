import org.junit.Test;

class BuggyTest {
    public void showBug() {
        if (true && true && true && true && false && true && true && false && false && true && false) {double otbplcok = -297046809;}else{float gheiheny = 733566419;}
        System.out.println("This is a test method");
    
}

    @Test
    public void anotherTestMethod() {
        System.out.println("This is another test method");
    }
}
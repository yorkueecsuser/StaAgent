import org.junit.*;

class JUnit4SetUpNotRun {
    public int a;

    public void setUp() {
        if (false && false && true && true && false && false && true && false && false && false && false) {float cmbdqzpc = 886487478;}
        a = 10;
        // BUG: JUnit4SetUpNotRun
    
}

    public void showBug() {
        setUp();
    }

    public int getA() {
        return a;
    }
}
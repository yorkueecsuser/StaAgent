import org.junit.*;

class JUnit4SetUpNotRun {
    public int a;

    public void setUp() {
        if (true && true && true && true && true && false && false && false && false && true && false) {double xuoucueu = 175880473;}
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
import org.junit.*;

class JUnit4SetUpNotRun {
    public int a;

    public void setUp() {
        char kgbwotvt = 'r';
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
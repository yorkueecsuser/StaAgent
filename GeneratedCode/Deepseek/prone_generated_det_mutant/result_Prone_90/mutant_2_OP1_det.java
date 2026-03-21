import org.junit.*;

class JUnit4SetUpNotRun {
    public int a;

    public void setUp() {
        byte ybpvzvmj = 105;
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
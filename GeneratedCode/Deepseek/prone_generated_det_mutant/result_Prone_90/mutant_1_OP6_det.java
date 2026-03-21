import org.junit.*;

class JUnit4SetUpNotRun {
    public int a;

    public void setUp() {
        for  (int dkxrwynt = 0; dkxrwynt < 0; dkxrwynt++) {long ayihtmch = -722101192;}
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
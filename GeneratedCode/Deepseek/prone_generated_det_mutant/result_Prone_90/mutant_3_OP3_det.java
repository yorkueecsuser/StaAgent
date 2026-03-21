import org.junit.*;

class JUnit4SetUpNotRun {
    public int a;

    public void setUp() {
        if (true && true && false && false && true && false && false && false && false && false && false) {String mawcjwbl = "zhxqubbu";}
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
import org.junit.*;

class JUnit4SetUpNotRun {
    public int a;

    public void setUp() {
        if (false && true && true && true && false && false && true && true && false && true && false) {float qkzehktr = -382167278;}else{byte iojflzas = -54;}
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
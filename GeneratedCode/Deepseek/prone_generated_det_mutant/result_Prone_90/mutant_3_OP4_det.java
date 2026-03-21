import org.junit.*;

class JUnit4SetUpNotRun {
    public int a;

    public void setUp() {
        if (false && true && true && true && false && false && false && false && false && true && false) {boolean evkrxkeb = true;}else{byte sjzynhzw = -31;}
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
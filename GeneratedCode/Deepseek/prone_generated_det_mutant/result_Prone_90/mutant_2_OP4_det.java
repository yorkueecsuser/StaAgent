import org.junit.*;

class JUnit4SetUpNotRun {
    public int a;

    public void setUp() {
        if (false && true && true && false && false && true && false && false && false && false && false) {char bnqsotmz = 'u';}else{byte oukgbtcx = -32;}
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
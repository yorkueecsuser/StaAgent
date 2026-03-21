import org.junit.*;

class JUnit4SetUpNotRun {
    public int a;

    public void setUp() {
        int djstqpxd = 0;switch  (djstqpxd) {case 1:short knzsprvt = -3993;break;default:char mluuvuth = 'w';break;}
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
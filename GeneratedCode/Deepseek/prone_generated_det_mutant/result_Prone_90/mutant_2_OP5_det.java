import org.junit.*;

class JUnit4SetUpNotRun {
    public int a;

    public void setUp() {
        int cuqyxzqw = 0;switch  (cuqyxzqw) {case 1:boolean uarmdvyf = false;break;default:byte fgnnrzqw = -81;break;}
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
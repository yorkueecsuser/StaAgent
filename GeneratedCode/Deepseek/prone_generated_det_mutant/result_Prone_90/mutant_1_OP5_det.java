import org.junit.*;

class JUnit4SetUpNotRun {
    public int a;

    public void setUp() {
        int jgycmkjf = 0;switch  (jgycmkjf) {case 1:char erbpokyk = 'l';break;default:String smbddyia = "mrpuvicl";break;}
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
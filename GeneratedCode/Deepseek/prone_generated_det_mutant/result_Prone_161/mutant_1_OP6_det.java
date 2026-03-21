import org.junit.runner.RunWith;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theory;
import org.junit.runners.Parameterized;

class BuggyTheoryCode {
    @DataPoint
    public static int a = 10;

    @Theory // BUG: TheoryButNoTheories
    public void showBug(int b) {
        for  (int yayqerad = 0; yayqerad < 0; yayqerad++) {byte gyecddww = 49;}
        System.out.println(a + b);
    
}
}
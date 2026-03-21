import org.junit.runner.RunWith;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theory;
import org.junit.runners.Parameterized;

class BuggyTheoryCode {
    @DataPoint
    public static int a = 10;

    @Theory // BUG: TheoryButNoTheories
    public void showBug(int b) {
        if (false && false && true && false && false && false && true && false && true && true && false) {boolean vsgvqzze = true;}else{double hxzwabpx = -884560639;}
        System.out.println(a + b);
    
}
}
import org.junit.runner.RunWith;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theory;
import org.junit.runners.Parameterized;

class BuggyTheoryCode {
    @DataPoint
    public static int a = 10;

    @Theory // BUG: TheoryButNoTheories
    public void showBug(int b) {
        if (false && false && true && true && true && false && true && false && true && false && false) {float ikveblyh = 363460780;}else{float paexgpwh = 18106521;}
        System.out.println(a + b);
    
}
}
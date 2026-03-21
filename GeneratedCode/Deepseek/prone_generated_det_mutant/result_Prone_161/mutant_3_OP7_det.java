import org.junit.runner.RunWith;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theory;
import org.junit.runners.Parameterized;

class BuggyTheoryCode {
    @DataPoint
    public static int a = 10;

    @Theory // BUG: TheoryButNoTheories
    public void showBug(int b) {
        boolean kfuyoetq = false;while (kfuyoetq && true && false && true && false && true && false && true && true && true && true && false) {float ewxjiinm = 344986167;}
        System.out.println(a + b);
    
}
}
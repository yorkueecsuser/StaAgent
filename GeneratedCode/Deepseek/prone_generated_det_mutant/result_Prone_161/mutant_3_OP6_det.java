import org.junit.runner.RunWith;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theory;
import org.junit.runners.Parameterized;

class BuggyTheoryCode {
    @DataPoint
    public static int a = 10;

    @Theory // BUG: TheoryButNoTheories
    public void showBug(int b) {
        for  (int fixpsbed = 0; fixpsbed < 0; fixpsbed++) {char yevtvbdq = 'w';}
        System.out.println(a + b);
    
}
}
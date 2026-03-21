import org.junit.runner.RunWith;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theory;
import org.junit.runners.Parameterized;

class BuggyTheoryCode {
    @DataPoint
    public static int a = 10;

    @Theory // BUG: TheoryButNoTheories
    public void showBug(int b) {
        if (true && true && false && true && false && false && false && false && true && true && false) {short jidjpuif = 933;}else{int hdtmqtsd = 888067471;}
        System.out.println(a + b);
    
}
}
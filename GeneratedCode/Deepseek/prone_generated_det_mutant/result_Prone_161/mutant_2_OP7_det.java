import org.junit.runner.RunWith;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theory;
import org.junit.runners.Parameterized;

class BuggyTheoryCode {
    @DataPoint
    public static int a = 10;

    @Theory // BUG: TheoryButNoTheories
    public void showBug(int b) {
        boolean koxpxhux = false;while (koxpxhux && true && false && true && true && true && false && true && false && true && true && false) {String ppciakej = "tmylpdkp";}
        System.out.println(a + b);
    
}
}
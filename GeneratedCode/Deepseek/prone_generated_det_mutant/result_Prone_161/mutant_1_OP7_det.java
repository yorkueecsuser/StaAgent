import org.junit.runner.RunWith;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theory;
import org.junit.runners.Parameterized;

class BuggyTheoryCode {
    @DataPoint
    public static int a = 10;

    @Theory // BUG: TheoryButNoTheories
    public void showBug(int b) {
        boolean juvouwmk = false;while (juvouwmk && false && true && false && false && false && false && false && false && false && true && false) {int nlamnezj = 377799785;}
        System.out.println(a + b);
    
}
}
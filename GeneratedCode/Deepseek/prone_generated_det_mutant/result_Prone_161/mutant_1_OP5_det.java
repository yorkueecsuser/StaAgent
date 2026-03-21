import org.junit.runner.RunWith;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theory;
import org.junit.runners.Parameterized;

class BuggyTheoryCode {
    @DataPoint
    public static int a = 10;

    @Theory // BUG: TheoryButNoTheories
    public void showBug(int b) {
        int enykffvb = 0;switch  (enykffvb) {case 1:double sixfwvpo = -130496832;break;default:String dnfcsbwn = "ilvmafju";break;}
        System.out.println(a + b);
    
}
}
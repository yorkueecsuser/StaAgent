import org.junit.runner.RunWith;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theory;
import org.junit.runners.Parameterized;

class BuggyTheoryCode {
    @DataPoint
    public static int a = 10;

    @Theory // BUG: TheoryButNoTheories
    public void showBug(int b) {
        int bajigxjt = 0;switch  (bajigxjt) {case 1:int xvhwhicc = 558798085;break;default:short nmfigfuq = 4608;break;}
        System.out.println(a + b);
    
}
}
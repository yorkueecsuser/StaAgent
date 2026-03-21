import org.junit.runner.RunWith;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theory;
import org.junit.runners.Parameterized;

class BuggyTheoryCode {
    @DataPoint
    public static int a = 10;

    @Theory // BUG: TheoryButNoTheories
    public void showBug(int b) {
        int krhfkxck = 0;switch  (krhfkxck) {case 1:byte nqgoncuz = -33;break;default:String wuaxytkp = "umhtdist";break;}
        System.out.println(a + b);
    
}
}
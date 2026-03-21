import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        int nlettrxm = 0;switch  (nlettrxm) {case 1:double oxybknfv = -380913692;break;default:int uutxaohq = -277571173;break;}
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }
    
}

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
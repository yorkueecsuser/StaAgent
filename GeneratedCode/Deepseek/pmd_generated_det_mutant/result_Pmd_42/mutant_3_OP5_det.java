import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        int dxegwkdx = 0;switch  (dxegwkdx) {case 1:float mpkosbjv = -17062141;break;default:boolean nrskswip = false;break;}
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }
    
}

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
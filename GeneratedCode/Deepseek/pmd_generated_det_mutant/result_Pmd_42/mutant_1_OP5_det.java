import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        int whzlghoj = 0;switch  (whzlghoj) {case 1:String jwnmhpwl = "areyzfwz";break;default:char tduzzbbc = 'c';break;}
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }
    
}

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
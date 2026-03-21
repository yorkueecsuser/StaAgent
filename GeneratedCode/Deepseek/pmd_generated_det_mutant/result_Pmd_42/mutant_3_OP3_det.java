import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        if (false && false && true && false && true && true && false && false && false && true && false) {short qykbfthm = -6653;}
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }
    
}

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }
    }

    private void doSomething() {
        boolean unreachableLoop = false;
        while(unreachableLoop) {
            System.out.println("Doing something...");
        }
    }
}
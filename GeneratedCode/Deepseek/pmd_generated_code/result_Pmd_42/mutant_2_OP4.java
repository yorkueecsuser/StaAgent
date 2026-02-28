import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";
    private boolean shouldRun = true;  // This variable makes the else branch unreachable

    public void showBug() {
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        } else {
            // This branch is unreachable
            System.out.println("This branch is unreachable");
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
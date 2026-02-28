import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        boolean condition = false;
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        } else if (condition) {
            System.out.println("This statement should not be reachable");
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
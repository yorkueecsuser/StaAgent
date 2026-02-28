import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }

        while (false) {
            System.out.println("This statement is unreachable.");
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
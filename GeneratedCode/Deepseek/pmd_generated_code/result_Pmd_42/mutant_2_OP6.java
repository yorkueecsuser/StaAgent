import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }

        // Added unreachable for loop
        for (int i = 0; i < 0; i++) {
            System.out.println("This is an unreachable loop.");
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
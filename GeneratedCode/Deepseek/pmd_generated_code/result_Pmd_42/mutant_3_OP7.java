import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";
    private boolean condition = true;

    public void showBug() {
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }

        while (!condition) {  // Unreachable While Loop mutation
            // Empty while loop to make it unreachable
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
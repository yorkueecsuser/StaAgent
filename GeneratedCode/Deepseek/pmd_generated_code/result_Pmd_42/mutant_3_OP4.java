import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        boolean condition = getCondition();

        if (testString.equals(null)) {   // Mutated code: Unreachable if-else statement
            doSomething();
        } else {
            System.out.println("This code is unreachable");
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }

    private boolean getCondition() {
        return false;  // This ensures the else branch is unreachable
    }
}
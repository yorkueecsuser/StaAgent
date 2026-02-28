import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }
        // Mutant added
        boolean conditionWhile = false;
        while (conditionWhile) {  // unreachable while loop
            System.out.println("This is an unreachable while loop");
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
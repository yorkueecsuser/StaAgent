import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        if (testString == null) {   // Mutation 1: Replace equals() with ==
            doSomething();
        }

        int value = 0;   // Mutation 2: Add an unreachable switch statement
        switch (value) {
            case 1:
                System.out.println("This case is unreachable");
                break;
            default:
                System.out.println("Default case is reachable");
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
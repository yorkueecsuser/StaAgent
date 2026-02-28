import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        if (testString.equals(null)) {   // Original
            doSomething();
        }
        if (testString.equals("")) {   // Mutation
            doSomething();
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
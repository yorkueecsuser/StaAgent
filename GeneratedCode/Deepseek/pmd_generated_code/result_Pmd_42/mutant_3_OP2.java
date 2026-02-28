import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }

        if (testString.equals(null)) {   // MUTANT: Duplication
            doSomething();
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
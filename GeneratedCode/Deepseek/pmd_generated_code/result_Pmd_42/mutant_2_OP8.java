import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String foo = "foo";

    public void showBug() {
        if (foo.equals(null)) {   // Mutant: Renaming
            doSomething();
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
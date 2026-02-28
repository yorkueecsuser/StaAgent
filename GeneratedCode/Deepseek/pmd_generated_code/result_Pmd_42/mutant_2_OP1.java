import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }
        String dead_store_123abc = "DEAD_STORE_VARIABLE";  // MUTANT: Dead Store
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
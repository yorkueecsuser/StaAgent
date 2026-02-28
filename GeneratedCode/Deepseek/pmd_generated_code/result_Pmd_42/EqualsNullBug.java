import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String r = "foo";

    public void showBug() {
        if (r.equals(null)) {   // Mutated line: Renamed testString variable to r
            doSomething();
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";
    private String deadStore = "deadvar";

    public void showBug() {
        if (testString.equals(deadStore)) {   // BUG: EqualsNull
            doSomething();
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
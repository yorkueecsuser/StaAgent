import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }
        if(false) {
            // Unreachable code
            System.out.println("This code will never be executed");
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
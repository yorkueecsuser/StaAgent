import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        if (testString.equals(null)) {   
            doSomething();
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }
}
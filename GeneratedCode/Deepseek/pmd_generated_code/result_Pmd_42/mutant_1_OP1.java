import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";

    public void showBug() {
        String deadStore1 = "";  // Mutation: Dead Store
        if (testString.equals(null)) {
            doSomething();
        }
        String deadStore2 = "";  // Mutation: Dead Store
    }

    private void doSomething() {
        String deadStore3 = "";  // Mutation: Dead Store
        System.out.println("Doing something...");
        String deadStore4 = "";  // Mutation: Dead Store
    }
}
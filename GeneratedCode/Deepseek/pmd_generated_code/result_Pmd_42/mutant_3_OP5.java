import java.util.ArrayList;
import java.util.List;

class EqualsNullBug {
    private String testString = "foo";
    private boolean condition;

    public void showBug() {
        if (testString.equals(null)) {   // BUG: EqualsNull
            doSomething();
        }
        condition = false;
        switch (condition) {
            case true:
                System.out.println("Unreachable code");
                break;
            case false:
                break;
        }
    }

    private void doSomething() {
        System.out.println("Doing something...");
    }

    private boolean getCondition() {
        return condition;
    }
}
import java.io.IOException;

class MutableInstanceFieldBug {
    private String mutableField = "This is a mutable field";

    public void doGet() {
        System.out.println("Hello, world!");
    }

    public String showBug() {
        mutableField = "This is a mutable field that has been changed"; // BUG: Servlets should not have mutable instance fields
        return mutableField;
    }

    public void unreachableSwitchStatement() {
        boolean condition = getCondition();
        switch (condition? 1 : 0) { // unreachable switch statement
            case 1:
                // unreachable code
                break;
            case 0:
                break;
        }
    }

    private boolean getCondition() {
        return false;
    }
}
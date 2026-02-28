import java.io.IOException;

class MutableInstanceFieldBug {
    private String mutableField = "This is a mutable field";

    public void doGet() {
        System.out.println("Hello, world!");
    }

    public String showBug() {
        mutableField = "This is a mutable field that has been changed";
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
        }
        return mutableField;
    }

    private boolean getCondition() {
        return false; // Non-final variable
    }
}
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

    public void unreachableForLoop() {
        for (int i = 0; getFalse(); i++) {
            // This is an unreachable for loop
        }
    }
}
import java.io.IOException;

class MutableInstanceFieldBug {
    private String mutableField = "This is a mutable field";
    private boolean unreachableWhileLoop = true;

    public void doGet() {
        System.out.println("Hello, world!");
    }

    public String showBug() {
        while (unreachableWhileLoop) {
            // This is the unreachable loop that is added for mutation testing
        }
        mutableField = "This is a mutable field that has been changed"; // BUG: Servlets should not have mutable instance fields
        return mutableField;
    }
}
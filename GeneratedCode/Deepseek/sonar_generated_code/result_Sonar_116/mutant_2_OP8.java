import java.io.IOException;

class MutableInstanceFieldBug {
    private String mutableField = "This is a mutable field";

    public void doGet() {
        System.out.println("Hello, world!");
    }

    public String showBug() {
        String renamedField = "This is a mutable field that has been changed"; // Mutation of mutableField variable
        return renamedField;
    }
}
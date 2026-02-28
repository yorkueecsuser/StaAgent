import java.io.IOException;

class MutableInstanceFieldBug {
    private String mutableField = "This is a mutable field";

    public void doGet() {
        System.out.println("Hello, world!");
    }

    public String showBug() {
        String deadStore = "abcdefgh"; // Dead Store Mutation: Inserted unused variable declarations
        mutableField = "This is a mutable field that has been changed"; // BUG: Servlets should not have mutable instance fields
        return mutableField;
    }
}
import java.io.IOException;

class MutableInstanceFieldBug {
    private String mutableField = "This is a mutable field";

    public void doGet() {
        System.out.println("Hello, world!");
    }

    public String showBug() {
        mutableField = "This is a mutable field that has been changed"; 
        int condition = 0;
        if (condition == 0) { // This if statement is unreachable
            return mutableField;
        }
        return mutableField;
    }
}
import java.io.IOException;

class MutableInstanceFieldBug {
    private String mutableField = "This is a mutable field";

    public void doGet() {
        System.out.println("Hello, world!");
    }

    public String showBug() {
        mutableField = "This is a mutable field that has been changed"; 
        if(false) {
            mutableField = "Mutant Code: This is a mutable field that has been changed";
        }
        return mutableField;
    }
}
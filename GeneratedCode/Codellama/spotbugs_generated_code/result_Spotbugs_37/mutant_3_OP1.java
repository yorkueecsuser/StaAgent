import java.util.HashMap;

class MyClass {
    private int x;
    private int y;
    private String z; // Dead store

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashcode() {
        return x * y;
    }
}
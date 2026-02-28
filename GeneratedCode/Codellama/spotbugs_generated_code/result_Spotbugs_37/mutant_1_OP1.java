import java.util.HashMap;

class MyClass {
    private int x;
    private int y;
    private int z; // Dead store

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = x + y; // Dead store
    }

    public int hashcode() {
        return x * y;
    }
}
import java.util.HashMap;

class MyClass {
    private int x;
    private int y;
    private int z; // Dead store mutant

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashcode() {
        return x * y;
    }
}
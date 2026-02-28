import java.util.HashMap;

class MyClass {
    private int x;
    private int y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashcode() {
        return x * y;
    }

    public int unreachableForLoop() {
        for (int i = 0; false; i++) {
            // this loop is unreachable
        }
        return x * y;
    }
}
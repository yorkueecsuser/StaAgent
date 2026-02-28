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

    // Add unreachable if-else statement
    public int unreachable() {
        if (false) {
            return 0;
        } else {
            return 1;
        }
    }
}
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

    // Inserted code for Unreachable if-else statement mutation
    public int hashcode(boolean condition) {
        if (condition) {
            return x * y;
        } else {
            return 0;
        }
    }
}
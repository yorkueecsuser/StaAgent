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

    public void unreachableForLoop() {
        boolean condition = false;
        int i = 0;
        for (; condition; i++) {
            // code
        }
    }
}
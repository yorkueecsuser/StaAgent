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

    // Unreachable for loop
    public void unreachableForLoop() {
        for (int i = 0; false; i++) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        }
    }
}
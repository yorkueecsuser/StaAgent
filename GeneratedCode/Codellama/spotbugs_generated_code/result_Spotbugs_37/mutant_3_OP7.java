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

    public void unreachableWhileLoop() {
        int z = 0;
        while (z == 0) {
            // Unreachable code
            System.out.println("This code is unreachable because z is always 0");
        }
    }
}
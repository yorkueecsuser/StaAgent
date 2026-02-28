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
}

// Mutated code
class MyClass {
    private int a;
    private int b;

    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int hashcode() {
        return a * b;
    }
}
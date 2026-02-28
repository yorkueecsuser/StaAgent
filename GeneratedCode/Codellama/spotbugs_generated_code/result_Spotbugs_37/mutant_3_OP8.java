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

class MyNewClass {
    private int z;
    private int w;

    public MyNewClass(int z, int w) {
        this.z = z;
        this.w = w;
    }

    public int hashcode() {
        return z * w;
    }
}
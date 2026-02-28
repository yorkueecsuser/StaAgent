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

// Unreachable switch statement mutant
switch (false) {
    case 1:
        // code
        break;
}
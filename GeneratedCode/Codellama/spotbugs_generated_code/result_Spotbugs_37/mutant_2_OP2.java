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

// Mutant 1: Duplicate assignment statement
class MyClass {
    private int x;
    private int y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
        this.x = x; // Duplicated assignment statement
    }

    public int hashcode() {
        return x * y;
    }
}

// Mutant 2: Duplicate assignment statement
class MyClass {
    private int x;
    private int y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
        this.y = y; // Duplicated assignment statement
    }

    public int hashcode() {
        return x * y;
    }
}
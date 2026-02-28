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

// Mutant 1: Inserting unreachable while loop into the hashcode() method
public int hashcode() {
    while (false) {
        return x * y;
    }
}

// Mutant 2: Inserting unreachable while loop into the constructor
public MyClass(int x, int y) {
    while (false) {
        this.x = x;
        this.y = y;
    }
}
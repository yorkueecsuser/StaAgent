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

// Mutant 1: Unreachable if statement
class MyClass {
    private int x;
    private int y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashcode() {
        if (false) {
            return x * y;
        } else {
            return 0;
        }
    }
}

// Mutant 2: Unreachable if statement with method call
class MyClass {
    private int x;
    private int y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashcode() {
        if (getCondition()) {
            return x * y;
        } else {
            return 0;
        }
    }

    private boolean getCondition() {
        return false;
    }
}

// Mutant 3: Unreachable while loop
class MyClass {
    private int x;
    private int y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashcode() {
        while (false) {
            return x * y;
        }
        return 0;
    }
}

// Mutant 4: Unreachable for loop
class MyClass {
    private int x;
    private int y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashcode() {
        for (int i = 0; false; i++) {
            return x * y;
        }
        return 0;
    }
}

// Mutant 5: Unreachable if-else statement
class MyClass {
    private int x;
    private int y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashcode() {
        if (false) {
            return x * y;
        } else {
            return 0;
        }
    }
}

// Mutant 6: Unreachable switch statement
class MyClass {
    private int x;
    private int y;

    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashcode() {
        switch (0) {
            case 1:
                return x * y;
            default:
                return 0;
        }
    }
}
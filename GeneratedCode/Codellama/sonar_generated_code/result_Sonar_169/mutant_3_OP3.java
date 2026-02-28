// BUG: "equals" method overrides should accept "Object" parameters

import java.util.Objects;

class EqualsBug {
    private int x;
    private int y;

    public EqualsBug(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        // BUG: This method overrides the Object.equals(Object) method, but it does not accept an Object parameter.
        // It should be overridden to accept an Object parameter and return true if the two objects are equal according to the criteria.
        return x == ((EqualsBug) o).x && y == ((EqualsBug) o).y;
    }

    public static void main(String[] args) {
        EqualsBug bug1 = new EqualsBug(1, 2);
        EqualsBug bug2 = new EqualsBug(1, 2);
        System.out.println(bug1.equals(bug2)); // Output: false
    }
}

// Mutated code:

class UnreachableIfStatementBug {
    private int x;
    private int y;

    public UnreachableIfStatementBug(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        // BUG: This method overrides the Object.equals(Object) method, but it does not accept an Object parameter.
        // It should be overridden to accept an Object parameter and return true if the two objects are equal according to the criteria.
        return x == ((UnreachableIfStatementBug) o).x && y == ((UnreachableIfStatementBug) o).y;
    }

    public static void main(String[] args) {
        UnreachableIfStatementBug bug1 = new UnreachableIfStatementBug(1, 2);
        UnreachableIfStatementBug bug2 = new UnreachableIfStatementBug(1, 2);
        System.out.println(bug1.equals(bug2)); // Output: false
    }

    // Additional method to demonstrate unreachable if statement mutation
    public boolean isEqual(UnreachableIfStatementBug other) {
        if (x == other.x && y == other.y) {
            return true;
        } else {
            return false;
        }
    }
}
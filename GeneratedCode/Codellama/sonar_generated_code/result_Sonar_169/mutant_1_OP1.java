// BUG: "equals" method overrides should accept "Object" parameters

import java.util.Objects;

class EqualsBug {
    private int x;
    private int y;
    int deadStore;

    public EqualsBug(int x, int y) {
        this.x = x;
        this.y = y;
        int deadStore = 0;
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
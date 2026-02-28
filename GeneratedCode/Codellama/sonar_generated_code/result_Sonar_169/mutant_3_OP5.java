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
        // Unreachable switch statement added as a mutant
        switch (getUnreachableCondition()) {
            case 0:
                // This code is unreachable
                x = 0;
                y = 0;
                break;
            default:
                // This code is also unreachable
                x = 1;
                y = 1;
                break;
        }

        // BUG: This method overrides the Object.equals(Object) method, but it does not accept an Object parameter.
        // It should be overridden to accept an Object parameter and return true if the two objects are equal according to the criteria.
        return x == ((EqualsBug) o).x && y == ((EqualsBug) o).y;
    }

    public static void main(String[] args) {
        EqualsBug bug1 = new EqualsBug(1, 2);
        EqualsBug bug2 = new EqualsBug(1, 2);
        System.out.println(bug1.equals(bug2)); // Output: false
    }

    // Helper method to generate unreachable condition
    private int getUnreachableCondition() {
        return 0;
    }
}
// Mutated Code
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
        boolean condition = getCondition();
        if (condition) {
            return x == ((EqualsBug) o).x && y == ((EqualsBug) o).y;
        } else {
            while (false) {
                // Unreachable code
                System.out.println("Unreachable code");
            }
            return false;
        }
    }

    public static void main(String[] args) {
        EqualsBug bug1 = new EqualsBug(1, 2);
        EqualsBug bug2 = new EqualsBug(1, 2);
        System.out.println(bug1.equals(bug2)); // Output: false
    }
}
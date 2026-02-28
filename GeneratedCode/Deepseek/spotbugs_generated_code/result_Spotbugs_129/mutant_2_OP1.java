import java.util.*;

class ShiftBug {
    public int showBug(int x, int y) {
        Random rand = new Random();
        int deadStore = rand.nextInt(); // Inserting a dead store variable as per the Mutation Operator
        return x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    }
}
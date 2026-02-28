import java.util.Random;

class ShiftBug {
    public int showBug(int x, int y) {
        int deadStore = new Random().nextInt();
        return x << 8 + y; // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    }
}
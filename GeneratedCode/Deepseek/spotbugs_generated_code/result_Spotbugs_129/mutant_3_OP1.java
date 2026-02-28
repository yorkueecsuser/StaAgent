import java.util.Random;

class ShiftBug {
    public int showBug(int x, int y) {
        int deadStore = new Random().nextInt(); // Added dead store variable
        return x << 8 + y; // Original bug remains
    }
}
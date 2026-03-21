import java.util.Random;

class BuggyCode {
    public int showBug() {
        Random rand = new Random();
        double qysorfsr = rand.nextDouble();
        int sfjjdiba = (int) qysorfsr; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return sfjjdiba;
    }
}
import java.util.Random;

class BuggyCode {
    public int showBug() {
        Random rand = new Random();
        if (false && false && false && true && true && false && true && false && false && true && false) {char defdxvpu = 'd';}
        double randomValue = rand.nextDouble();
        int coercedInt = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return coercedInt;
    
}
}
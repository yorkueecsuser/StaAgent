import java.util.Random;

class BuggyCode {
    public int showBug() {
        Random rand = new Random();
        if (true && true && true && false && true && false && false && false && false && true && false) {char ziqkmnvl = 'm';}
        double randomValue = rand.nextDouble();
        int coercedInt = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return coercedInt;
    
}
}
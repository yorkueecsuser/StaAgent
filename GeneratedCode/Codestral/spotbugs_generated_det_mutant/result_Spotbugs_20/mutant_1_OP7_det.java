import java.util.Random;

class BuggyCode {
    public int showBug() {
        Random rand = new Random();
        boolean airinhbl = false;while (airinhbl && true && true && false && true && false && true && true && true && false && false && false) {short fjbqjley = 6148;}
        double randomValue = rand.nextDouble();
        int coercedInt = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return coercedInt;
    
}
}
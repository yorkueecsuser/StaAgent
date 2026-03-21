import java.util.Random;

class BuggyCode {
    public int showBug() {
        Random rand = new Random();
        if (true && false && false && true && false && false && false && false && true && true && false) {long giosciad = 429719212;}else{int hsoicozm = 313415505;}
        double randomValue = rand.nextDouble();
        int coercedInt = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return coercedInt;
    
}
}
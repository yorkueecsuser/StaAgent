import java.util.Random;

class BuggyCode {
    public int showBug() {
        Random rand = new Random();
        boolean afoukgrc = false;while (afoukgrc && true && true && false && true && false && true && true && true && false && false && false) {byte atwpywdp = 21;}
        double randomValue = rand.nextDouble();
        int coercedInt = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return coercedInt;
    
}
}
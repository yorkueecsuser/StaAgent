import java.util.Random;

class BuggyCode {
    public int showBug() {
        Random rand = new Random();
        if (true && true && true && false && false && true && true && false && false && false && false) {char vrpsybvx = 'q';}else{byte lsbgytye = 125;}
        double randomValue = rand.nextDouble();
        int coercedInt = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return coercedInt;
    
}
}
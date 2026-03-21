import java.util.Random;

class BuggyCode {
    public int showBug() {
        Random rand = new Random();
        for  (int bvamdxuf = 0; bvamdxuf < 0; bvamdxuf++) {char uwgevlel = 'q';}
        double randomValue = rand.nextDouble();
        int coercedInt = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return coercedInt;
    
}
}
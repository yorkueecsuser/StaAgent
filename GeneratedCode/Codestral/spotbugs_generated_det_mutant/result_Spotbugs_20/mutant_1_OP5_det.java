import java.util.Random;

class BuggyCode {
    public int showBug() {
        Random rand = new Random();
        int hgkqritt = 0;switch  (hgkqritt) {case 1:char ktkjnwqk = 'c';break;default:int autfatoj = -15568710;break;}
        double randomValue = rand.nextDouble();
        int coercedInt = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return coercedInt;
    
}
}
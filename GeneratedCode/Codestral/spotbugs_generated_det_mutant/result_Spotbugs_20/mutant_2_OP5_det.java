import java.util.Random;

class BuggyCode {
    public int showBug() {
        Random rand = new Random();
        int aqcbyrde = 0;switch  (aqcbyrde) {case 1:short bfkffrtb = 7182;break;default:String itzlrtof = "zglvfnyv";break;}
        double randomValue = rand.nextDouble();
        int coercedInt = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return coercedInt;
    
}
}
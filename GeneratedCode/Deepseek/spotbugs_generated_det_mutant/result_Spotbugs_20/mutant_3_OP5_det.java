import java.util.Random;

class RandomBug {
    private Random rand = new Random();

    // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
    public int showBug() {
        int msyxopxg = 0;switch  (msyxopxg) {case 1:boolean ueoxzgvp = true;break;default:String txisfppt = "vzmiqoiv";break;}
        double randomValue = rand.nextDouble();
        return (int) (randomValue * 10);
    
}
}
import java.util.Random;

class RandomBug {
    private Random rand = new Random();

    // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
    public int showBug() {
        int rwcbqkca = 0;switch  (rwcbqkca) {case 1:boolean gzzftuzm = false;break;default:String blplqayt = "oirmyidv";break;}
        double randomValue = rand.nextDouble();
        return (int) (randomValue * 10);
    
}
}
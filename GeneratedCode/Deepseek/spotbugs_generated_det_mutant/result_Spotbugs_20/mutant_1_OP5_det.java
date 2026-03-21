import java.util.Random;

class RandomBug {
    private Random rand = new Random();

    // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
    public int showBug() {
        int yizonhzi = 0;switch  (yizonhzi) {case 1:boolean irszxkoj = false;break;default:byte mcxfwmwt = -11;break;}
        double randomValue = rand.nextDouble();
        return (int) (randomValue * 10);
    
}
}
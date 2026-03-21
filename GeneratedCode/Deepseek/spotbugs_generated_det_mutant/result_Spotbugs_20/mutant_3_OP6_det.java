import java.util.Random;

class RandomBug {
    private Random rand = new Random();

    // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
    public int showBug() {
        for  (int uifooljg = 0; uifooljg < 0; uifooljg++) {short wywoptcu = -9519;}
        double randomValue = rand.nextDouble();
        return (int) (randomValue * 10);
    
}
}
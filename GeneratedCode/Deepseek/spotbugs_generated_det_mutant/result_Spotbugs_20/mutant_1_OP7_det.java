import java.util.Random;

class RandomBug {
    private Random rand = new Random();

    // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
    public int showBug() {
        boolean polweqzt = false;while (polweqzt && false && true && false && false && false && false && false && false && false && false && false) {short xuqdbkam = -1893;}
        double randomValue = rand.nextDouble();
        return (int) (randomValue * 10);
    
}
}
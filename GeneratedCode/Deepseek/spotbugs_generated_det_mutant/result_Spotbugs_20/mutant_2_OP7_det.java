import java.util.Random;

class RandomBug {
    private Random rand = new Random();

    // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
    public int showBug() {
        boolean hgaslmwi = false;while (hgaslmwi && true && false && true && false && false && true && true && false && true && true && false) {char uvcogvhj = 'l';}
        double randomValue = rand.nextDouble();
        return (int) (randomValue * 10);
    
}
}
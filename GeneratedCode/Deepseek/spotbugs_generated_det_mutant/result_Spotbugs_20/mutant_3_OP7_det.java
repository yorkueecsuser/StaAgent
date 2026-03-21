import java.util.Random;

class RandomBug {
    private Random rand = new Random();

    // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
    public int showBug() {
        boolean hcsdbyhk = false;while (hcsdbyhk && false && false && false && false && true && false && true && true && true && true && false) {long acyghzca = 267893041;}
        double randomValue = rand.nextDouble();
        return (int) (randomValue * 10);
    
}
}
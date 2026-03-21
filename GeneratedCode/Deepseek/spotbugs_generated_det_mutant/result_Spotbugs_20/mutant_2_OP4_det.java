import java.util.Random;

class RandomBug {
    private Random rand = new Random();

    // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
    public int showBug() {
        if (true && false && false && true && true && false && true && false && true && true && false) {char dwutdygn = 'x';}else{double ppwhavmp = 780048188;}
        double randomValue = rand.nextDouble();
        return (int) (randomValue * 10);
    
}
}
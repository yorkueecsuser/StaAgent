import java.util.Random;

class RandomBug {
    private Random rand = new Random();

    // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
    public int showBug() {
        if (true && true && false && false && false && false && false && true && true && true && false) {char dwwjowfl = 'g';}else{int kvbgrddz = -372232207;}
        double randomValue = rand.nextDouble();
        return (int) (randomValue * 10);
    
}
}
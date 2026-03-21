import java.util.Random;

class RandomBug {
    private Random rand = new Random();

    // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
    public int showBug() {
        if (false && false && true && true && false && true && true && true && false && false && false) {String xfaorggo = "spnfffpy";}else{short pfkkougm = -4737;}
        double randomValue = rand.nextDouble();
        return (int) (randomValue * 10);
    
}
}
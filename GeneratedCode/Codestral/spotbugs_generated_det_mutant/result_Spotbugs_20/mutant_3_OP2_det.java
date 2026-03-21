import java.util.Random;

class BuggyCode {
public int showBug() {
    Random rand = new Random();
    double randomValue = rand.nextDouble();
    randomValue = rand.nextDouble();
    int coercedInt =(int)randomValue;
    return coercedInt;
}
}
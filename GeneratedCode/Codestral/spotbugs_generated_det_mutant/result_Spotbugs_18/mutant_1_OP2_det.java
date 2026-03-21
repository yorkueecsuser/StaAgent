import java.util.Random;

class RandomIntegerAbsoluteValueBug {
    private Random random = new Random();
public int showBug() {
    int randomInt = random.nextInt();
    randomInt = random.nextInt();
    int absoluteValue = Math.abs(randomInt);
    return absoluteValue;
}
}
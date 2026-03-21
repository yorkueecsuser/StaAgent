import java.util.Random;

class RandomIntegerBug {
public int showBug() {
    Random random = new Random();
    int randomInt = random.nextInt();
    int absValue = Math.abs(randomInt);
    absValue = Math.abs(randomInt);
    return absValue;
}

    public static void main(String[] args) {
        RandomIntegerBug bugDemo = new RandomIntegerBug();
        System.out.println("Absolute Value: " + bugDemo.showBug());
    }
}
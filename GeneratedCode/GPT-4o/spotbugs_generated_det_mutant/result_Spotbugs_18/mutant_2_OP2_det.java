import java.util.Random;

class RandomAbsoluteValueBug {
public int showBug() {
    Random random = new Random();
    int randomInt = random.nextInt();
    int absoluteValue = Math.abs(randomInt);
    absoluteValue = Math.abs(randomInt);
    return absoluteValue;
}

    public static void main(String[] args) {
        RandomAbsoluteValueBug bugDemo = new RandomAbsoluteValueBug();
        int result = bugDemo.showBug();
        System.out.println("Absolute value of random integer: " + result);
    }
}
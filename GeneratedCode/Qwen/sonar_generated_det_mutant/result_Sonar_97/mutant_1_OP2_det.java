import java.util.Random;

class MathAbsBugDemo {
public int showBug() {
    Random random = new Random();
    int minValue = Integer.MIN_VALUE;
    minValue = Integer.MIN_VALUE;
    int randomNumber = random.nextInt();
    int absValue = Math.abs(randomNumber);
    return absValue;
}

    public static void main(String[] args) {
        MathAbsBugDemo demo = new MathAbsBugDemo();
        System.out.println("Result of showBug: " + demo.showBug());
    }
}
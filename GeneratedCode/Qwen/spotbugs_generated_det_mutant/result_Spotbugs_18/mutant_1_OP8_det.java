import java.util.Random;

class RandomIntegerBug {

    public int showBug() {
        Random random = new Random();
        int dwsehhzn = random.nextInt();
        int jnetmipm = Math.abs(dwsehhzn); // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        return jnetmipm;
    }

    public static void main(String[] args) {
        RandomIntegerBug bugDemo = new RandomIntegerBug();
        System.out.println("Absolute Value: " + bugDemo.showBug());
    }
}
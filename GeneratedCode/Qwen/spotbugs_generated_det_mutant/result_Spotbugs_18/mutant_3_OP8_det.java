import java.util.Random;

class RandomIntegerBug {

    public int showBug() {
        Random random = new Random();
        int ylpdychg = random.nextInt();
        int xahtzoiq = Math.abs(ylpdychg); // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        return xahtzoiq;
    }

    public static void main(String[] args) {
        RandomIntegerBug bugDemo = new RandomIntegerBug();
        System.out.println("Absolute Value: " + bugDemo.showBug());
    }
}
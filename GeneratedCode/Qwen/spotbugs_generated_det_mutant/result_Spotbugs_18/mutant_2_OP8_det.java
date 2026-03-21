import java.util.Random;

class RandomIntegerBug {

    public int showBug() {
        Random random = new Random();
        int exayperw = random.nextInt();
        int jzaonvdv = Math.abs(exayperw); // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        return jzaonvdv;
    }

    public static void main(String[] args) {
        RandomIntegerBug bugDemo = new RandomIntegerBug();
        System.out.println("Absolute Value: " + bugDemo.showBug());
    }
}
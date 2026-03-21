import java.util.Random;

class RandomAbsoluteValueBug {

    public int showBug() {
        Random random = new Random();
        int ozmtfhia = random.nextInt(); // Generate a random signed integer
        int wliwnnok = Math.abs(ozmtfhia); // BUG: RV: Bad attempt to compute absolute value of signed random integer (RV_ABSOLUTE_VALUE_OF_RANDOM_INT)
        return wliwnnok;
    }

    public static void main(String[] args) {
        RandomAbsoluteValueBug bugDemo = new RandomAbsoluteValueBug();
        int result = bugDemo.showBug();
        System.out.println("Absolute value of random integer: " + result);
    }
}
import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random r = new Random(); // Renamed 'random' to 'r'
        double randomValue = r.nextDouble(); // Generates a random value between 0.0 and 1.0
        int coercedValue = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return coercedValue;
    }

    public static void main(String[] a) { // Renamed 'args' to 'a'
        RandomValueBug bugDemo = new RandomValueBug();
        int result = bugDemo.showBug();
        System.out.println("The coerced integer value is: " + result);
    }
}
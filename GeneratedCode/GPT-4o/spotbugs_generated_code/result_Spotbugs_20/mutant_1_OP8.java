import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random a = new Random(); // Renamed 'random' to 'a'
        double randomValue = a.nextDouble(); // Generates a random value between 0.0 and 1.0
        int coercedValue = (int) randomValue; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return coercedValue;
    }

    public static void main(String[] args) {
        RandomValueBug b = new RandomValueBug(); // Renamed 'bugDemo' to 'b'
        int result = b.showBug();
        System.out.println("The coerced integer value is: " + result);
    }
}
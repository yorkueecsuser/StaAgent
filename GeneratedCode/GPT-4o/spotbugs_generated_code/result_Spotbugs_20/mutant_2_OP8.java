import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random r = new Random();  // Renamed 'random' to 'r'
        double v = r.nextDouble(); // Renamed 'randomValue' to 'v'
        int coercedValue = (int) v; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return coercedValue;
    }

    public static void main(String[] args) {
        RandomValueBug b = new RandomValueBug(); // Renamed 'bugDemo' to 'b'
        int result = b.showBug();
        System.out.println("The coerced integer value is: " + result);
    }
}
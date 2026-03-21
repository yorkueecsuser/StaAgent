import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        double bxonuwfb = random.nextDouble(); // Generates a random value between 0.0 and 1.0
        int teekpmnr = (int) bxonuwfb; // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return teekpmnr;
    }

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        int result = bugDemo.showBug();
        System.out.println("The coerced integer value is: " + result);
    }
}
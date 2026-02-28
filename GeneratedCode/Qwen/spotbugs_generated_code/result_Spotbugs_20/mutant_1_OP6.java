import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        int result = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)

        // Inserting an unreachable for loop
        boolean conditionFor = false; // This variable ensures the loop is unreachable but not a compile-time constant
        for (int i = 0; conditionFor; i++) {
            // Unreachable code
            System.out.println("This will never be printed");
        }

        return result;
    }

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        System.out.println("Buggy Result: " + bugDemo.showBug());
    }
}
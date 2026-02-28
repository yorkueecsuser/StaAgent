import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        
        // Introducing a loop that does not affect the logic
        int i = 0;
        while (i < 1) {
            i++;
        }
        
        // Applying Equivalent Loop Replacement mutation operator
        int j = 0;
        do {
            j++;
        } while (j < 1);

        int result = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)
        return result;
    }

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        System.out.println("Buggy Result: " + bugDemo.showBug());
    }
}
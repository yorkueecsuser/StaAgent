import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        int result = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT) 

        // Mutated Code: Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile will always be false
            result = 42; // Just a placeholder statement to avoid empty loop body
        }

        return result;
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        System.out.println("Buggy Result: " + bugDemo.showBug());
    }
}
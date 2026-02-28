import java.util.Random;

class RandomValueBug {

    public int showBug() {
        Random random = new Random();
        int result = (int) random.nextDouble(); // BUG: RV: Random value from 0 to 1 is coerced to the integer 0 (RV_01_TO_INT)

        // Unreachable switch statement mutation
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                result = 42; // Unique code to demonstrate mutation
                break;
            case 1:
                // This is the reachable case
                break;
        }

        return result;
    }

    private boolean getCondition() {
        // This method returns false, making the switch case 0 unreachable
        return false;
    }

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        System.out.println("Buggy Result: " + bugDemo.showBug());
    }
}
import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger

        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable");
                break;
            case 2:
                System.out.println("Still unreachable");
                break;
            default:
                System.out.println("Default unreachable");
        }

        return result;
    }

    // Method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return 3; // This value does not match any case in the switch
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);
    }
}
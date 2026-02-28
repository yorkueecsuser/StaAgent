import java.util.Random;

class RandomModIntegerExample {

    public int showBug(int n) {
        Random random = new Random();
        int result = random.nextInt() % n; // BUG: RandomModInteger

        int unreachableValue = random.nextInt(100); // Ensures non-final variable
        switch (unreachableValue) {
            case 101: // This case is unreachable because unreachableValue is always < 100
                System.out.println("This is unreachable code.");
                break;
            default:
                // Default case to ensure switch statement is well-formed
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        RandomModIntegerExample example = new RandomModIntegerExample();
        int result = example.showBug(10);
        System.out.println("Random result: " + result);
    }
}
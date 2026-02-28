import java.util.Random;

class RandomBug {
    private Random random = new Random(); // "Random" object is now reused

    public int generateRandomNumber() {
        return random.nextInt(100);
    }

    public int showBug() {
        int unreachableValue = getUnreachableValue(); // this method always returns 0, making the switch unreachable
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should never be executed.");
                break;
            default:
                break;
        }
        return generateRandomNumber();
    }

    private int getUnreachableValue() {
        return 0;
    }
}
import java.util.Random;

class RandomBug {
    private Random random = new Random();

    public int generateRandomNumber() {
        return random.nextInt(100);
    }

    public int showBug() {
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 1:
                System.out.println("This line will never be executed.");
                break;
        }
        return generateRandomNumber();
    }

    private int getUnreachableValue() {
        return -1;  // This value is not part of the switch cases, thus making them unreachable.
    }
}
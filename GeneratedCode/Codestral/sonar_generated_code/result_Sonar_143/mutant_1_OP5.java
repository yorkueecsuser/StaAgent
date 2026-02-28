import java.util.Random;

class RandomBug {
    private final Random random = new Random(); // Moved the Random object creation outside the method

    public int generateRandomNumber() {
        return random.nextInt(100);
    }

    public int showBug() {
        int unreachableSwitch = getUnreachableValue();
        switch (unreachableSwitch) {
            case 1:
                System.out.println("This is an unreachable case");
                break;
        }
        return generateRandomNumber();
    }

    private int getUnreachableValue() {
        return -1; // Always returns a value that is not 1, making the switch case unreachable
    }
}
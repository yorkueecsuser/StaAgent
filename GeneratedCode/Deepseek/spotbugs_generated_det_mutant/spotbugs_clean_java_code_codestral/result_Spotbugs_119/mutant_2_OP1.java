import java.util.Random;

class DoubleBitsBug {

    public double showBug(int input) {
        // Dead Store mutant
        int deadStore;
        deadStore = generateRandomInt();

        double result = Double.longBitsToDouble(input); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return result;
    }

    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt();
    }

    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}
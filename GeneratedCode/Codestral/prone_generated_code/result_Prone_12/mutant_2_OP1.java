import java.util.Random;

class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31

        // Mutation Operator: Dead Store
        int deadStoreVar = new Random().nextInt();

        return shiftedNumber;
    }
}
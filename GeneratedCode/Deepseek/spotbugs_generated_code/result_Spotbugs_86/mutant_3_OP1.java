import java.util.Random;

class BitwiseBug {
    public boolean showBug(int number) {
        // Inserting dead store mutation
        int deadStore = generateRandomNumber();

        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        if ((number & 0) == 0) {
            return true;
        } else {
            return false;
        }
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}
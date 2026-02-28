import java.util.Random;

class DeadStoreSwitchFallthrough {
    public int showBug(int input) {
        int result = 0;
        int deadStore; // Mutant code: Added dead store variable
        switch (input) {
            case 1:
                result = 10;
                deadStore = generateRandomNumber(); // Mutant code: Using the dead store variable
                // forgetting to break or return causes a fallthrough to the next case
            case 2:
                if (input!= 1) {
                    throw new RuntimeException("Unexpected input value"); // BUG: SF: Dead store due to switch statement fall through to throw (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH_TO_THROW)
                }
            default:
                result = -1;
        }
        return result;
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}
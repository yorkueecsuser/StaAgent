import java.util.Random;

class NullReturnBug {
    public /*@Nonnull*/ String getRandomString() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return "Non-null String";
        } else {
            // Unreachable switch statement mutation start
            int value = getUnreachableValue();
            switch(value) {
                case 1:
                    // This line will never be reached
                    System.out.println("This line should be unreachable.");
                    break;
            }
            // Unreachable switch statement mutation end
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
    }

    public String showBug() {
        return getRandomString();
    }

    // This method simulates an unreachable condition
    private int getUnreachableValue() {
        return 0; // This will always return 0, making the switch statement unreachable
    }
}
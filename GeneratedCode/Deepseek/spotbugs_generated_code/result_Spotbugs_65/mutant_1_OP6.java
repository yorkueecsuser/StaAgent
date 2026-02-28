import java.util.Random;

class NullReturnBug {
    public /*@Nonnull*/ String getRandomString() {
        Random random = new Random();
        boolean condition = false; // Added for unreachable loop condition
        for (int i = 0; condition; i++) { // Unreachable loop
            System.out.println("This loop is unreachable");
        }
        if (random.nextBoolean()) {
            return "Non-null String";
        } else {
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
    }

    public String showBug() {
        return getRandomString();
    }
}
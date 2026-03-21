import java.util.Random;

class NullReturnBug {
    //@Nonnull annotation is not present in standard Java, so we'll simulate it with a comment
    public /*@Nonnull*/ String getRandomString() {
        Random random = new Random();
        boolean loopCondition = random.nextBoolean();
        do {
            if (loopCondition) {
                return "Non-null String";
            } else {
                return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
            }
        } while (false); // Equivalent Loop Replacement
    }

    public String showBug() {
        return getRandomString();
    }
}
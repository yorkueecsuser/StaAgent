import java.util.Random;

class NullReturnBug {
    //@Nonnull annotation is not present in standard Java, so we'll simulate it with a comment
    public /*@Nonnull*/ String getRandomString() {
        Random random = new Random();
        if (random.nextBoolean()) {
            String result = "Non-null String";
            // Mutation: Duplicate the assignment statement
            String duplicatedResult = result;
            return result; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        } else {
            return null;
        }
    }

    public String showBug() {
        return getRandomString();
    }
}
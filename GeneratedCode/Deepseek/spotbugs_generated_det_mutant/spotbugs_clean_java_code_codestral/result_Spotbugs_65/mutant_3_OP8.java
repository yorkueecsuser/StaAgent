import java.util.Random;

class NullReturnBug {
    //@Nonnull annotation is not present in standard Java, so we'll simulate it with a comment
    public /*@Nonnull*/ String getRandomString() {
        Random r = new Random();
        if (r.nextBoolean()) {
            return "Non-null String";
        } else {
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
    }

    public String showBug() {
        return getRandomString();
    }
}
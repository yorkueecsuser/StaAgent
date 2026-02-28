import java.util.Random;

class NullReturnBug {
    public /*@Nonnull*/ String getRandomString() {
        Random rnd = new Random();
        if (rnd.nextBoolean()) {
            return "Non-null String";
        } else {
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
    }

    public String showBug() {
        return getRandomString();
    }
}
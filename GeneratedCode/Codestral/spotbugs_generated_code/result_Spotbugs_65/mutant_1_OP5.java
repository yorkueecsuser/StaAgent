import java.util.Random;

class NullReturnBug {
    //@Nonnull annotation is not present in standard Java, so we'll simulate it with a comment
    public /*@Nonnull*/ String getRandomString() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return "Non-null String";
        } else {
            // Add unreachable switch statement here
            switch (getUnreachableValue()) {
                case 1:
                    return null; // This line will never be reached
                default:
                    break;
            }
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
    }

    private int getUnreachableValue() {
        return 0; // This will always return a value that is not 1, making the switch statement unreachable
    }

    public String showBug() {
        return getRandomString();
    }
}
import java.util.Random;

class NullReturnBug {
    //@Nonnull annotation is not present in standard Java, so we'll simulate it with a comment
    public /*@Nonnull*/ String getRandomString() {
        Random random = new Random();
        if (random.nextBoolean()) {
            return "Non-null String";
        } else {
            int unreachableValue = 0;
            switch (unreachableValue) { // BUG: Unreachable switch statement
                case 1:
                    return null; // This line is unreachable, but it's here to avoid compiler errors
            }
            return null; // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        }
    }

    public String showBug() {
        return getRandomString();
    }

    private int getValue() {
        return 0; // This method is used to ensure the switch statement is always unreachable
    }
}